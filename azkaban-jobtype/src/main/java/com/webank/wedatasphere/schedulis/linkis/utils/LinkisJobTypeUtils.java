/*
 * Copyright 2020 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.schedulis.linkis.utils;

import com.webank.wedatasphere.schedulis.linkis.conf.LinkisJobTypeConf;

/**
 * Created by peacewong on 2019/11/3.
 */
public class LinkisJobTypeUtils {

    public static boolean isSignalNode(String jobType){
        String[] nodes = LinkisJobTypeConf.SIGNAL_NODES.getValue().split(",");
        for(String node : nodes){
            if (node.equalsIgnoreCase(jobType)) {
                return true;
            }
        }
        return false;
    }

}

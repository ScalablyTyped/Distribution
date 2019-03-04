package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessConfiguration extends js.Object {
  /**
    * Details about bug work items
    */
  var bugWorkItems: CategoryConfiguration
  /**
    * Details about portfolio backlogs
    */
  var portfolioBacklogs: js.Array[CategoryConfiguration]
  /**
    * Details of requirement backlog
    */
  var requirementBacklog: CategoryConfiguration
  /**
    * Details of task backlog
    */
  var taskBacklog: CategoryConfiguration
  /**
    * Type fields for the process configuration
    */
  var typeFields: org.scalablytyped.runtime.StringDictionary[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
  ]
  var url: java.lang.String
}

object ProcessConfiguration {
  @scala.inline
  def apply(
    bugWorkItems: CategoryConfiguration,
    portfolioBacklogs: js.Array[CategoryConfiguration],
    requirementBacklog: CategoryConfiguration,
    taskBacklog: CategoryConfiguration,
    typeFields: org.scalablytyped.runtime.StringDictionary[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemFieldReference
    ],
    url: java.lang.String
  ): ProcessConfiguration = {
    val __obj = js.Dynamic.literal(bugWorkItems = bugWorkItems, portfolioBacklogs = portfolioBacklogs, requirementBacklog = requirementBacklog, taskBacklog = taskBacklog, typeFields = typeFields, url = url)
  
    __obj.asInstanceOf[ProcessConfiguration]
  }
}


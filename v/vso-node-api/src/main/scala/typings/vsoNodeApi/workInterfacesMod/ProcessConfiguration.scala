package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
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
  var typeFields: StringDictionary[WorkItemFieldReference]
  var url: String
}

object ProcessConfiguration {
  @scala.inline
  def apply(
    bugWorkItems: CategoryConfiguration,
    portfolioBacklogs: js.Array[CategoryConfiguration],
    requirementBacklog: CategoryConfiguration,
    taskBacklog: CategoryConfiguration,
    typeFields: StringDictionary[WorkItemFieldReference],
    url: String
  ): ProcessConfiguration = {
    val __obj = js.Dynamic.literal(bugWorkItems = bugWorkItems.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], typeFields = typeFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessConfiguration]
  }
}


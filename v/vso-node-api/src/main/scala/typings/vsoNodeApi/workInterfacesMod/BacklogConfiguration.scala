package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogConfiguration extends js.Object {
  /**
    * Behavior/type field mapping
    */
  var backlogFields: BacklogFields
  /**
    * Bugs behavior
    */
  var bugsBehavior: BugsBehavior
  /**
    * Hidden Backlog
    */
  var hiddenBacklogs: js.Array[String]
  /**
    * Portfolio backlog descriptors
    */
  var portfolioBacklogs: js.Array[BacklogLevelConfiguration]
  /**
    * Requirement backlog
    */
  var requirementBacklog: BacklogLevelConfiguration
  /**
    * Task backlog
    */
  var taskBacklog: BacklogLevelConfiguration
  var url: String
  /**
    * Mapped states for work item types
    */
  var workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
}

object BacklogConfiguration {
  @scala.inline
  def apply(
    backlogFields: BacklogFields,
    bugsBehavior: BugsBehavior,
    hiddenBacklogs: js.Array[String],
    portfolioBacklogs: js.Array[BacklogLevelConfiguration],
    requirementBacklog: BacklogLevelConfiguration,
    taskBacklog: BacklogLevelConfiguration,
    url: String,
    workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
  ): BacklogConfiguration = {
    val __obj = js.Dynamic.literal(backlogFields = backlogFields.asInstanceOf[js.Any], bugsBehavior = bugsBehavior.asInstanceOf[js.Any], hiddenBacklogs = hiddenBacklogs.asInstanceOf[js.Any], portfolioBacklogs = portfolioBacklogs.asInstanceOf[js.Any], requirementBacklog = requirementBacklog.asInstanceOf[js.Any], taskBacklog = taskBacklog.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeMappedStates = workItemTypeMappedStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogConfiguration]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  var hiddenBacklogs: js.Array[java.lang.String]
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
  var url: java.lang.String
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
    hiddenBacklogs: js.Array[java.lang.String],
    portfolioBacklogs: js.Array[BacklogLevelConfiguration],
    requirementBacklog: BacklogLevelConfiguration,
    taskBacklog: BacklogLevelConfiguration,
    url: java.lang.String,
    workItemTypeMappedStates: js.Array[WorkItemTypeStateInfo]
  ): BacklogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backlogFields")(backlogFields)
    __obj.updateDynamic("bugsBehavior")(bugsBehavior)
    __obj.updateDynamic("hiddenBacklogs")(hiddenBacklogs)
    __obj.updateDynamic("portfolioBacklogs")(portfolioBacklogs)
    __obj.updateDynamic("requirementBacklog")(requirementBacklog)
    __obj.updateDynamic("taskBacklog")(taskBacklog)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItemTypeMappedStates")(workItemTypeMappedStates)
    __obj.asInstanceOf[BacklogConfiguration]
  }
}


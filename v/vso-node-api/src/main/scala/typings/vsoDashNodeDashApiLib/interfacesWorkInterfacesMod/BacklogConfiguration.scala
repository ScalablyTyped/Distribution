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


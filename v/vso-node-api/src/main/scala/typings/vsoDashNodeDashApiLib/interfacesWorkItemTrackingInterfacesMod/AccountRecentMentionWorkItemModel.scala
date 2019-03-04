package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecentMentionWorkItemModel extends js.Object {
  /**
    * Assigned To
    */
  var assignedTo: java.lang.String
  /**
    * Work Item Id
    */
  var id: scala.Double
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: stdLib.Date
  /**
    * State of the work item
    */
  var state: java.lang.String
  /**
    * Team project the work item belongs to
    */
  var teamProject: java.lang.String
  /**
    * Title of the work item
    */
  var title: java.lang.String
  /**
    * Type of Work Item
    */
  var workItemType: java.lang.String
}

object AccountRecentMentionWorkItemModel {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    id: scala.Double,
    mentionedDateField: stdLib.Date,
    state: java.lang.String,
    teamProject: java.lang.String,
    title: java.lang.String,
    workItemType: java.lang.String
  ): AccountRecentMentionWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, id = id, mentionedDateField = mentionedDateField, state = state, teamProject = teamProject, title = title, workItemType = workItemType)
  
    __obj.asInstanceOf[AccountRecentMentionWorkItemModel]
  }
}


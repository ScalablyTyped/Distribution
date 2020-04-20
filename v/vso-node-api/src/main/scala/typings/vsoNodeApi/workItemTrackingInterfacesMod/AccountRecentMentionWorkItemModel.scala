package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecentMentionWorkItemModel extends js.Object {
  /**
    * Assigned To
    */
  var assignedTo: String
  /**
    * Work Item Id
    */
  var id: Double
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: Date
  /**
    * State of the work item
    */
  var state: String
  /**
    * Team project the work item belongs to
    */
  var teamProject: String
  /**
    * Title of the work item
    */
  var title: String
  /**
    * Type of Work Item
    */
  var workItemType: String
}

object AccountRecentMentionWorkItemModel {
  @scala.inline
  def apply(
    assignedTo: String,
    id: Double,
    mentionedDateField: Date,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentMentionWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mentionedDateField = mentionedDateField.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentMentionWorkItemModel]
  }
}


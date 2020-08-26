package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecentMentionWorkItemModel extends js.Object {
  /**
    * Assigned To
    */
  var assignedTo: String = js.native
  /**
    * Work Item Id
    */
  var id: Double = js.native
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: Date = js.native
  /**
    * State of the work item
    */
  var state: String = js.native
  /**
    * Team project the work item belongs to
    */
  var teamProject: String = js.native
  /**
    * Title of the work item
    */
  var title: String = js.native
  /**
    * Type of Work Item
    */
  var workItemType: String = js.native
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
  @scala.inline
  implicit class AccountRecentMentionWorkItemModelOps[Self <: AccountRecentMentionWorkItemModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMentionedDateField(value: Date): Self = this.set("mentionedDateField", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeamProject(value: String): Self = this.set("teamProject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemType(value: String): Self = this.set("workItemType", value.asInstanceOf[js.Any])
  }
  
}


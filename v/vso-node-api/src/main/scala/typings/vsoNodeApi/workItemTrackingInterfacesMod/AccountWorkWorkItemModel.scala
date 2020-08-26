package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountWorkWorkItemModel extends js.Object {
  var assignedTo: String = js.native
  var changedDate: Date = js.native
  var id: Double = js.native
  var state: String = js.native
  var teamProject: String = js.native
  var title: String = js.native
  var workItemType: String = js.native
}

object AccountWorkWorkItemModel {
  @scala.inline
  def apply(
    assignedTo: String,
    changedDate: Date,
    id: Double,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountWorkWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountWorkWorkItemModel]
  }
  @scala.inline
  implicit class AccountWorkWorkItemModelOps[Self <: AccountWorkWorkItemModel] (val x: Self) extends AnyVal {
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
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
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


package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountWorkWorkItemModel extends js.Object {
  var assignedTo: String
  var changedDate: Date
  var id: Double
  var state: String
  var teamProject: String
  var title: String
  var workItemType: String
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
}


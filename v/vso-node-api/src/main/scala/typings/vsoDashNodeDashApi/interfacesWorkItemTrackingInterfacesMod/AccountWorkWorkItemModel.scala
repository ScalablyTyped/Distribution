package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, changedDate = changedDate, id = id, state = state, teamProject = teamProject, title = title, workItemType = workItemType)
  
    __obj.asInstanceOf[AccountWorkWorkItemModel]
  }
}


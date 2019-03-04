package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountWorkWorkItemModel extends js.Object {
  var assignedTo: java.lang.String
  var changedDate: stdLib.Date
  var id: scala.Double
  var state: java.lang.String
  var teamProject: java.lang.String
  var title: java.lang.String
  var workItemType: java.lang.String
}

object AccountWorkWorkItemModel {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    changedDate: stdLib.Date,
    id: scala.Double,
    state: java.lang.String,
    teamProject: java.lang.String,
    title: java.lang.String,
    workItemType: java.lang.String
  ): AccountWorkWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, changedDate = changedDate, id = id, state = state, teamProject = teamProject, title = title, workItemType = workItemType)
  
    __obj.asInstanceOf[AccountWorkWorkItemModel]
  }
}


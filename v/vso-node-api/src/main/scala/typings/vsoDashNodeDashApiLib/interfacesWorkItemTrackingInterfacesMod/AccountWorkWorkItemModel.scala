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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignedTo")(assignedTo)
    __obj.updateDynamic("changedDate")(changedDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("teamProject")(teamProject)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("workItemType")(workItemType)
    __obj.asInstanceOf[AccountWorkWorkItemModel]
  }
}


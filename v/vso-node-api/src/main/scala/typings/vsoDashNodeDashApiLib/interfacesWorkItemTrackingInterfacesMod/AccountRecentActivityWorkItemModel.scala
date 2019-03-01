package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecentActivityWorkItemModel extends js.Object {
  /**
    * Date of the last Activity by the user
    */
  var activityDate: stdLib.Date
  /**
    * Type of the activity
    */
  var activityType: WorkItemRecentActivityType
  /**
    * Assigned To
    */
  var assignedTo: java.lang.String
  /**
    * Last changed date of the work item
    */
  var changedDate: stdLib.Date
  /**
    * Work Item Id
    */
  var id: scala.Double
  /**
    * TeamFoundationId of the user this activity belongs to
    */
  var identityId: java.lang.String
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

object AccountRecentActivityWorkItemModel {
  @scala.inline
  def apply(
    activityDate: stdLib.Date,
    activityType: WorkItemRecentActivityType,
    assignedTo: java.lang.String,
    changedDate: stdLib.Date,
    id: scala.Double,
    identityId: java.lang.String,
    state: java.lang.String,
    teamProject: java.lang.String,
    title: java.lang.String,
    workItemType: java.lang.String
  ): AccountRecentActivityWorkItemModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activityDate")(activityDate)
    __obj.updateDynamic("activityType")(activityType)
    __obj.updateDynamic("assignedTo")(assignedTo)
    __obj.updateDynamic("changedDate")(changedDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("identityId")(identityId)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("teamProject")(teamProject)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("workItemType")(workItemType)
    __obj.asInstanceOf[AccountRecentActivityWorkItemModel]
  }
}


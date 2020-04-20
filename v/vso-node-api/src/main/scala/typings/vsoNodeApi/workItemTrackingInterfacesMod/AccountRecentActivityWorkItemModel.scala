package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecentActivityWorkItemModel extends js.Object {
  /**
    * Date of the last Activity by the user
    */
  var activityDate: Date
  /**
    * Type of the activity
    */
  var activityType: WorkItemRecentActivityType
  /**
    * Assigned To
    */
  var assignedTo: String
  /**
    * Last changed date of the work item
    */
  var changedDate: Date
  /**
    * Work Item Id
    */
  var id: Double
  /**
    * TeamFoundationId of the user this activity belongs to
    */
  var identityId: String
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

object AccountRecentActivityWorkItemModel {
  @scala.inline
  def apply(
    activityDate: Date,
    activityType: WorkItemRecentActivityType,
    assignedTo: String,
    changedDate: Date,
    id: Double,
    identityId: String,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentActivityWorkItemModel = {
    val __obj = js.Dynamic.literal(activityDate = activityDate.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], assignedTo = assignedTo.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentActivityWorkItemModel]
  }
}


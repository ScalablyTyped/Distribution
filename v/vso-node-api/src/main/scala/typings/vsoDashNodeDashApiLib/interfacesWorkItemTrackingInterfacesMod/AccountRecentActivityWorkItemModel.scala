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


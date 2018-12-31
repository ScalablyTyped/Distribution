package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecentMentionWorkItemModel extends js.Object {
  /**
    * Assigned To
    */
  var assignedTo: java.lang.String
  /**
    * Work Item Id
    */
  var id: scala.Double
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: stdLib.Date
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


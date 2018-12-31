package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventRole extends js.Object {
  /**
    * Gets or sets an Id for that role, this id is used by the event.
    */
  var id: java.lang.String
  /**
    * Gets or sets the Name for that role, this name is used for UI display.
    */
  var name: java.lang.String
  /**
    * Gets or sets whether this role can be a group or just an individual user
    */
  var supportsGroups: scala.Boolean
}


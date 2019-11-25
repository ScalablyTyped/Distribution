package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventRole extends js.Object {
  /**
    * Gets or sets an Id for that role, this id is used by the event.
    */
  var id: String
  /**
    * Gets or sets the Name for that role, this name is used for UI display.
    */
  var name: String
  /**
    * Gets or sets whether this role can be a group or just an individual user
    */
  var supportsGroups: Boolean
}

object NotificationEventRole {
  @scala.inline
  def apply(id: String, name: String, supportsGroups: Boolean): NotificationEventRole = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsGroups = supportsGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEventRole]
  }
}


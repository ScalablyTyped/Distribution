package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventRole extends js.Object {
  /**
    * Gets or sets an Id for that role, this id is used by the event.
    */
  var id: String = js.native
  /**
    * Gets or sets the Name for that role, this name is used for UI display.
    */
  var name: String = js.native
  /**
    * Gets or sets whether this role can be a group or just an individual user
    */
  var supportsGroups: Boolean = js.native
}

object NotificationEventRole {
  @scala.inline
  def apply(id: String, name: String, supportsGroups: Boolean): NotificationEventRole = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportsGroups = supportsGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventRole]
  }
  @scala.inline
  implicit class NotificationEventRoleOps[Self <: NotificationEventRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsGroups(value: Boolean): Self = this.set("supportsGroups", value.asInstanceOf[js.Any])
  }
  
}


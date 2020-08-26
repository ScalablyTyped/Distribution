package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeNotifications extends js.Object {
  /**
    * Whether the server wants to receive workspace folder
    * change notifications.
    *
    * If a strings is provided the string is treated as a ID
    * under which the notification is registed on the client
    * side. The ID can be used to unregister for these events
    * using the `client/unregisterCapability` request.
    */
  var changeNotifications: js.UndefOr[String | Boolean] = js.native
  /**
    * The Server has support for workspace folders
    */
  var supported: js.UndefOr[Boolean] = js.native
}

object ChangeNotifications {
  @scala.inline
  def apply(): ChangeNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeNotifications]
  }
  @scala.inline
  implicit class ChangeNotificationsOps[Self <: ChangeNotifications] (val x: Self) extends AnyVal {
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
    def setChangeNotifications(value: String | Boolean): Self = this.set("changeNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeNotifications: Self = this.set("changeNotifications", js.undefined)
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupported: Self = this.set("supported", js.undefined)
  }
  
}


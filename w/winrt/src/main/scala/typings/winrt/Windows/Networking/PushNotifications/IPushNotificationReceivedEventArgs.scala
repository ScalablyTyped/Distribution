package typings.winrt.Windows.Networking.PushNotifications

import typings.winrt.Windows.UI.Notifications.BadgeNotification
import typings.winrt.Windows.UI.Notifications.TileNotification
import typings.winrt.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationReceivedEventArgs extends js.Object {
  var badgeNotification: BadgeNotification = js.native
  var cancel: Boolean = js.native
  var notificationType: PushNotificationType = js.native
  var rawNotification: RawNotification = js.native
  var tileNotification: TileNotification = js.native
  var toastNotification: ToastNotification = js.native
}

object IPushNotificationReceivedEventArgs {
  @scala.inline
  def apply(
    badgeNotification: BadgeNotification,
    cancel: Boolean,
    notificationType: PushNotificationType,
    rawNotification: RawNotification,
    tileNotification: TileNotification,
    toastNotification: ToastNotification
  ): IPushNotificationReceivedEventArgs = {
    val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushNotificationReceivedEventArgs]
  }
  @scala.inline
  implicit class IPushNotificationReceivedEventArgsOps[Self <: IPushNotificationReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setBadgeNotification(value: BadgeNotification): Self = this.set("badgeNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationType(value: PushNotificationType): Self = this.set("notificationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawNotification(value: RawNotification): Self = this.set("rawNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileNotification(value: TileNotification): Self = this.set("tileNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setToastNotification(value: ToastNotification): Self = this.set("toastNotification", value.asInstanceOf[js.Any])
  }
  
}


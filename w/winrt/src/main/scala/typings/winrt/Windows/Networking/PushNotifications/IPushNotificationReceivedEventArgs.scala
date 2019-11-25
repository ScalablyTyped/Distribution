package typings.winrt.Windows.Networking.PushNotifications

import typings.winrt.Windows.UI.Notifications.BadgeNotification
import typings.winrt.Windows.UI.Notifications.TileNotification
import typings.winrt.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationReceivedEventArgs extends js.Object {
  var badgeNotification: BadgeNotification
  var cancel: Boolean
  var notificationType: PushNotificationType
  var rawNotification: RawNotification
  var tileNotification: TileNotification
  var toastNotification: ToastNotification
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
}


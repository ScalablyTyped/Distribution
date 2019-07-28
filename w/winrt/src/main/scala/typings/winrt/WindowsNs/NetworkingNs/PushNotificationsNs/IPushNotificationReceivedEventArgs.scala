package typings.winrt.WindowsNs.NetworkingNs.PushNotificationsNs

import typings.winrt.WindowsNs.UINs.NotificationsNs.BadgeNotification
import typings.winrt.WindowsNs.UINs.NotificationsNs.TileNotification
import typings.winrt.WindowsNs.UINs.NotificationsNs.ToastNotification
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
    val __obj = js.Dynamic.literal(badgeNotification = badgeNotification, cancel = cancel, notificationType = notificationType, rawNotification = rawNotification, tileNotification = tileNotification, toastNotification = toastNotification)
  
    __obj.asInstanceOf[IPushNotificationReceivedEventArgs]
  }
}


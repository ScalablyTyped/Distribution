package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationReceivedEventArgs extends js.Object {
  var badgeNotification: winrtLib.WindowsNs.UINs.NotificationsNs.BadgeNotification
  var cancel: scala.Boolean
  var notificationType: PushNotificationType
  var rawNotification: RawNotification
  var tileNotification: winrtLib.WindowsNs.UINs.NotificationsNs.TileNotification
  var toastNotification: winrtLib.WindowsNs.UINs.NotificationsNs.ToastNotification
}

object IPushNotificationReceivedEventArgs {
  @scala.inline
  def apply(
    badgeNotification: winrtLib.WindowsNs.UINs.NotificationsNs.BadgeNotification,
    cancel: scala.Boolean,
    notificationType: PushNotificationType,
    rawNotification: RawNotification,
    tileNotification: winrtLib.WindowsNs.UINs.NotificationsNs.TileNotification,
    toastNotification: winrtLib.WindowsNs.UINs.NotificationsNs.ToastNotification
  ): IPushNotificationReceivedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("badgeNotification")(badgeNotification)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("notificationType")(notificationType)
    __obj.updateDynamic("rawNotification")(rawNotification)
    __obj.updateDynamic("tileNotification")(tileNotification)
    __obj.updateDynamic("toastNotification")(toastNotification)
    __obj.asInstanceOf[IPushNotificationReceivedEventArgs]
  }
}


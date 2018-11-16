package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
@js.native
class PushNotificationReceivedEventArgs () extends IPushNotificationReceivedEventArgs {
  /* CompleteClass */
  override var badgeNotification: winrtLib.WindowsNs.UINs.NotificationsNs.BadgeNotification = js.native
  /* CompleteClass */
  override var cancel: scala.Boolean = js.native
  /* CompleteClass */
  override var notificationType: PushNotificationType = js.native
  /* CompleteClass */
  override var rawNotification: RawNotification = js.native
  /* CompleteClass */
  override var tileNotification: winrtLib.WindowsNs.UINs.NotificationsNs.TileNotification = js.native
  /* CompleteClass */
  override var toastNotification: winrtLib.WindowsNs.UINs.NotificationsNs.ToastNotification = js.native
}


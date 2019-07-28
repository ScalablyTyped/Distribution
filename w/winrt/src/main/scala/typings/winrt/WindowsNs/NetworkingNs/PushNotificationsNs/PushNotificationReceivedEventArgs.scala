package typings.winrt.WindowsNs.NetworkingNs.PushNotificationsNs

import typings.winrt.WindowsNs.UINs.NotificationsNs.BadgeNotification
import typings.winrt.WindowsNs.UINs.NotificationsNs.TileNotification
import typings.winrt.WindowsNs.UINs.NotificationsNs.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
@js.native
class PushNotificationReceivedEventArgs () extends IPushNotificationReceivedEventArgs {
  /* CompleteClass */
  override var badgeNotification: BadgeNotification = js.native
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /* CompleteClass */
  override var notificationType: PushNotificationType = js.native
  /* CompleteClass */
  override var rawNotification: RawNotification = js.native
  /* CompleteClass */
  override var tileNotification: TileNotification = js.native
  /* CompleteClass */
  override var toastNotification: ToastNotification = js.native
}


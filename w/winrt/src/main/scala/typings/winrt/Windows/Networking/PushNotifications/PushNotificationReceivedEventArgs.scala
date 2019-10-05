package typings.winrt.Windows.Networking.PushNotifications

import typings.winrt.Windows.UI.Notifications.BadgeNotification
import typings.winrt.Windows.UI.Notifications.TileNotification
import typings.winrt.Windows.UI.Notifications.ToastNotification
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


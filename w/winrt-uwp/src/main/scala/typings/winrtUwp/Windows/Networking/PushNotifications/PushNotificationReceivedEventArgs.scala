package typings.winrtUwp.Windows.Networking.PushNotifications

import typings.winrtUwp.Windows.UI.Notifications.BadgeNotification
import typings.winrtUwp.Windows.UI.Notifications.TileNotification
import typings.winrtUwp.Windows.UI.Notifications.ToastNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
trait PushNotificationReceivedEventArgs extends js.Object {
  /** Gets the content of a badge update to perform in response to this push notification. */
  var badgeNotification: BadgeNotification
  /** Gets or sets whether Windows should perform its default handling of the notification. */
  var cancel: Boolean
  /** Gets the type of push notification that has been received from the app server. */
  var notificationType: PushNotificationType
  var rawNotification: js.Any
   /* unmapped type */ /** Gets the content of a tile update to perform in response to this push notification. */
  var tileNotification: TileNotification
  /** Gets the content of a toast to display in response to this push notification. */
  var toastNotification: ToastNotification
}

object PushNotificationReceivedEventArgs {
  @scala.inline
  def apply(
    badgeNotification: BadgeNotification,
    cancel: Boolean,
    notificationType: PushNotificationType,
    rawNotification: js.Any,
    tileNotification: TileNotification,
    toastNotification: ToastNotification
  ): PushNotificationReceivedEventArgs = {
    val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationReceivedEventArgs]
  }
}


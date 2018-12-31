package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationReceivedEventArgs")
@js.native
abstract class PushNotificationReceivedEventArgs () extends js.Object {
  /** Gets the content of a badge update to perform in response to this push notification. */
  var badgeNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.BadgeNotification = js.native
  /** Gets or sets whether Windows should perform its default handling of the notification. */
  var cancel: scala.Boolean = js.native
  /** Gets the type of push notification that has been received from the app server. */
  var notificationType: PushNotificationType = js.native
  var rawNotification: js.Any = js.native
   /* unmapped type */ /** Gets the content of a tile update to perform in response to this push notification. */
  var tileNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.TileNotification = js.native
  /** Gets the content of a toast to display in response to this push notification. */
  var toastNotification: winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.ToastNotification = js.native
}


package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
class PushNotificationChannelManager () extends js.Object

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
object PushNotificationChannelManager extends js.Object {
  def createPushNotificationChannelForApplicationAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel] = js.native
  def createPushNotificationChannelForApplicationAsync(applicationId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel] = js.native
  def createPushNotificationChannelForSecondaryTileAsync(tileId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs.PushNotificationChannel] = js.native
}


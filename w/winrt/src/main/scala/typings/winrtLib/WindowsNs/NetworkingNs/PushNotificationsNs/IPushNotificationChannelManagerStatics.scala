package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationChannelManagerStatics extends js.Object {
  def createPushNotificationChannelForApplicationAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForApplicationAsync(applicationId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForSecondaryTileAsync(tileId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PushNotificationChannel] = js.native
}


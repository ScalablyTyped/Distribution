package typings.winrt.Windows.Networking.PushNotifications

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationChannelManagerStatics extends js.Object {
  def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[PushNotificationChannel] = js.native
}


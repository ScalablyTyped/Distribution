package typings.winrt.Windows.Networking.PushNotifications

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannel")
@js.native
class PushNotificationChannel () extends IPushNotificationChannel {
  /* CompleteClass */
  override var expirationTime: Date = js.native
  /* CompleteClass */
  override var onpushnotificationreceived: js.Any = js.native
  /* CompleteClass */
  override var uri: String = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
}


package typings.winrt.Windows.Networking.PushNotifications

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationChannel extends js.Object {
  var expirationTime: Date
  var onpushnotificationreceived: js.Any
  var uri: String
  def close(): Unit
}

object IPushNotificationChannel {
  @scala.inline
  def apply(close: () => Unit, expirationTime: Date, onpushnotificationreceived: js.Any, uri: String): IPushNotificationChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushNotificationChannel]
  }
}


package typings
package winrtLib.WindowsNs.NetworkingNs.PushNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationChannel extends js.Object {
  var expirationTime: stdLib.Date
  var onpushnotificationreceived: js.Any
  var uri: java.lang.String
  def close(): scala.Unit
}

object IPushNotificationChannel {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    expirationTime: stdLib.Date,
    onpushnotificationreceived: js.Any,
    uri: java.lang.String
  ): IPushNotificationChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime, onpushnotificationreceived = onpushnotificationreceived, uri = uri)
  
    __obj.asInstanceOf[IPushNotificationChannel]
  }
}


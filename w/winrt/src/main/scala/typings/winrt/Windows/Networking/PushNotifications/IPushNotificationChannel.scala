package typings.winrt.Windows.Networking.PushNotifications

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPushNotificationChannel extends js.Object {
  var expirationTime: Date = js.native
  var onpushnotificationreceived: js.Any = js.native
  var uri: String = js.native
  def close(): Unit = js.native
}

object IPushNotificationChannel {
  @scala.inline
  def apply(close: () => Unit, expirationTime: Date, onpushnotificationreceived: js.Any, uri: String): IPushNotificationChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPushNotificationChannel]
  }
  @scala.inline
  implicit class IPushNotificationChannelOps[Self <: IPushNotificationChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setExpirationTime(value: Date): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnpushnotificationreceived(value: js.Any): Self = this.set("onpushnotificationreceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}


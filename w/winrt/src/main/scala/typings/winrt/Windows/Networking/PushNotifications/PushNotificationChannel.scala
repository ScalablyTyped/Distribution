package typings.winrt.Windows.Networking.PushNotifications

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushNotificationChannel extends IPushNotificationChannel
object PushNotificationChannel {
  
  @scala.inline
  def apply(close: () => Unit, expirationTime: Date, onpushnotificationreceived: js.Any, uri: String): PushNotificationChannel = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationChannel]
  }
}

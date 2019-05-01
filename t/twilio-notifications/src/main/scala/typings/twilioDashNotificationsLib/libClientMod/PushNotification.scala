package typings
package twilioDashNotificationsLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotification extends js.Object {
  var messageType: java.lang.String
  var payload: js.Any
}

object PushNotification {
  @scala.inline
  def apply(messageType: java.lang.String, payload: js.Any): PushNotification = {
    val __obj = js.Dynamic.literal(messageType = messageType, payload = payload)
  
    __obj.asInstanceOf[PushNotification]
  }
}


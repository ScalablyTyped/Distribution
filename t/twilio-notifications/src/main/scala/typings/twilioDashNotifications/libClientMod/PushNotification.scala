package typings.twilioDashNotifications.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotification extends js.Object {
  var messageType: String
  var payload: js.Any
}

object PushNotification {
  @scala.inline
  def apply(messageType: String, payload: js.Any): PushNotification = {
    val __obj = js.Dynamic.literal(messageType = messageType, payload = payload)
  
    __obj.asInstanceOf[PushNotification]
  }
}


package typings.twilioChat.typingindicatorMod

import typings.twilioChat.transportMod.Transport
import typings.twilioNotifications.mod.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingIndicatorServices extends js.Object {
  var notificationClient: Notifications
  var transport: Transport
}

object TypingIndicatorServices {
  @scala.inline
  def apply(notificationClient: Notifications, transport: Transport): TypingIndicatorServices = {
    val __obj = js.Dynamic.literal(notificationClient = notificationClient.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypingIndicatorServices]
  }
}


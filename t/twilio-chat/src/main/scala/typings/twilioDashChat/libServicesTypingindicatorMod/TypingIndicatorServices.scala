package typings.twilioDashChat.libServicesTypingindicatorMod

import typings.twilioDashChat.libInterfacesTransportMod.Transport
import typings.twilioDashNotifications.twilioDashNotificationsMod.Notifications
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


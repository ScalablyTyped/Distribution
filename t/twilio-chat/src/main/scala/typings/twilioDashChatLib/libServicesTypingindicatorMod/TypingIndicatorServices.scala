package typings
package twilioDashChatLib.libServicesTypingindicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypingIndicatorServices extends js.Object {
  var notificationClient: twilioDashNotificationsLib.twilioDashNotificationsMod.Notifications
  var transport: twilioDashChatLib.libInterfacesTransportMod.Transport
}

object TypingIndicatorServices {
  @scala.inline
  def apply(
    notificationClient: twilioDashNotificationsLib.twilioDashNotificationsMod.Notifications,
    transport: twilioDashChatLib.libInterfacesTransportMod.Transport
  ): TypingIndicatorServices = {
    val __obj = js.Dynamic.literal(notificationClient = notificationClient, transport = transport)
  
    __obj.asInstanceOf[TypingIndicatorServices]
  }
}


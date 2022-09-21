package typings.twilioChat.mod

import typings.twilioNotifications.mod.Notifications
import typings.twilsock.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingIndicatorServices extends StObject {
  
  var notificationClient: Notifications
  
  var transport: Transport
}
object TypingIndicatorServices {
  
  inline def apply(notificationClient: Notifications, transport: Transport): TypingIndicatorServices = {
    val __obj = js.Dynamic.literal(notificationClient = notificationClient.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingIndicatorServices]
  }
  
  extension [Self <: TypingIndicatorServices](x: Self) {
    
    inline def setNotificationClient(value: Notifications): Self = StObject.set(x, "notificationClient", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}

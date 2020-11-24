package typings.twilioChat.typingindicatorMod

import typings.twilioChat.transportMod.Transport
import typings.twilioNotifications.mod.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypingIndicatorServices extends js.Object {
  
  var notificationClient: Notifications = js.native
  
  var transport: Transport = js.native
}
object TypingIndicatorServices {
  
  @scala.inline
  def apply(notificationClient: Notifications, transport: Transport): TypingIndicatorServices = {
    val __obj = js.Dynamic.literal(notificationClient = notificationClient.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingIndicatorServices]
  }
  
  @scala.inline
  implicit class TypingIndicatorServicesOps[Self <: TypingIndicatorServices] (val x: Self) extends AnyVal {
    
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
    def setNotificationClient(value: Notifications): Self = this.set("notificationClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: Transport): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
}

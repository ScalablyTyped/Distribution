package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelLinks extends StObject {
  
  var invites: String
  
  var messages: String
  
  var participants: String
  
  var self: String
}
object ChannelLinks {
  
  inline def apply(invites: String, messages: String, participants: String, self: String): ChannelLinks = {
    val __obj = js.Dynamic.literal(invites = invites.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelLinks]
  }
  
  extension [Self <: ChannelLinks](x: Self) {
    
    inline def setInvites(value: String): Self = StObject.set(x, "invites", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setParticipants(value: String): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}

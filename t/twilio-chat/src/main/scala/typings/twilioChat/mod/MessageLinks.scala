package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageLinks extends StObject {
  
  var conversation: String
  
  var messages_receipts: String
  
  var self: String
}
object MessageLinks {
  
  inline def apply(conversation: String, messages_receipts: String, self: String): MessageLinks = {
    val __obj = js.Dynamic.literal(conversation = conversation.asInstanceOf[js.Any], messages_receipts = messages_receipts.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageLinks]
  }
  
  extension [Self <: MessageLinks](x: Self) {
    
    inline def setConversation(value: String): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
    
    inline def setMessages_receipts(value: String): Self = StObject.set(x, "messages_receipts", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}

package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMHistoryMessage
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat history received
  */
trait ChatHistoryReceived
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id
    */
  var id: String
  
  /**
    * Message id specified in getInstantMessagingHistory method
    */
  var message_id: String
  
  /**
    * List of messages
    */
  var messages: js.Array[IMHistoryMessage]
}
object ChatHistoryReceived {
  
  inline def apply(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatHistoryReceived]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatHistoryReceived] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[IMHistoryMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: IMHistoryMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}

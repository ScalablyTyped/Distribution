package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMHistoryMessage
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room history received
  */
trait ChatRoomHistoryReceived
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Message id specified in getInstantMessagingHistory method
    */
  var message_id: String
  
  /**
    * List of messages
    */
  var messages: js.Array[IMHistoryMessage]
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomHistoryReceived {
  
  inline def apply(message_id: String, messages: js.Array[IMHistoryMessage], room: String): ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomHistoryReceived]
  }
  
  extension [Self <: ChatRoomHistoryReceived](x: Self) {
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[IMHistoryMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: IMHistoryMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

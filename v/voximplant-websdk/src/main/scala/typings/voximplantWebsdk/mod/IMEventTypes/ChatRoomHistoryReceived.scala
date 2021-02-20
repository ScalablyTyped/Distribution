package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMHistoryMessage
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room history received
  */
@js.native
trait ChatRoomHistoryReceived extends VoxImplantIMEvent {
  
  /**
    * Message id specified in getInstantMessagingHistory method
    */
  var message_id: String = js.native
  
  /**
    * List of messages
    */
  var messages: js.Array[IMHistoryMessage] = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomHistoryReceived {
  
  @scala.inline
  def apply(message_id: String, messages: js.Array[IMHistoryMessage], room: String): ChatRoomHistoryReceived = {
    val __obj = js.Dynamic.literal(message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomHistoryReceived]
  }
  
  @scala.inline
  implicit class ChatRoomHistoryReceivedMutableBuilder[Self <: ChatRoomHistoryReceived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: js.Array[IMHistoryMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: IMHistoryMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

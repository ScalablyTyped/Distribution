package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.IMHistoryMessage
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat history received
  */
@js.native
trait ChatHistoryReceived extends VoxImplantIMEvent {
  
  /**
    * User id
    */
  var id: String = js.native
  
  /**
    * Message id specified in getInstantMessagingHistory method
    */
  var message_id: String = js.native
  
  /**
    * List of messages
    */
  var messages: js.Array[IMHistoryMessage] = js.native
}
object ChatHistoryReceived {
  
  @scala.inline
  def apply(id: String, message_id: String, messages: js.Array[IMHistoryMessage]): ChatHistoryReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatHistoryReceived]
  }
  
  @scala.inline
  implicit class ChatHistoryReceivedOps[Self <: ChatHistoryReceived] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: IMHistoryMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[IMHistoryMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
}

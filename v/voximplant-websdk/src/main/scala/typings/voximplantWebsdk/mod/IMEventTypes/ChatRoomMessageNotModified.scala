package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched in case of error during chat room message modification
  */
@js.native
trait ChatRoomMessageNotModified extends VoxImplantIMEvent {
  
  /**
    * Error code
    */
  var code: Double = js.native
  
  /**
    * Message id
    */
  var message_id: String = js.native
  
  /**
    * Private/public message flag
    */
  var private_message: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
}
object ChatRoomMessageNotModified {
  
  @scala.inline
  def apply(code: Double, message_id: String, private_message: String, room: String): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
  
  @scala.inline
  implicit class ChatRoomMessageNotModifiedMutableBuilder[Self <: ChatRoomMessageNotModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_message(value: String): Self = StObject.set(x, "private_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

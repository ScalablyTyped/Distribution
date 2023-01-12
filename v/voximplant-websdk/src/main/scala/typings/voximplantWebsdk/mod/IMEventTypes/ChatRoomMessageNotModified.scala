package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched in case of error during chat room message modification
  */
trait ChatRoomMessageNotModified
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Error code
    */
  var code: Double
  
  /**
    * Message id
    */
  var message_id: String
  
  /**
    * Private/public message flag
    */
  var private_message: String
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomMessageNotModified {
  
  inline def apply(code: Double, message_id: String, private_message: String, room: String): ChatRoomMessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], private_message = private_message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomMessageNotModified]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRoomMessageNotModified] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setPrivate_message(value: String): Self = StObject.set(x, "private_message", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

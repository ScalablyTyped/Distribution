package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event dispatched in case of error while chat room operation
  */
@js.native
trait ChatRoomError extends VoxImplantIMEvent {
  
  /**
    * Error code
    */
  var code: String = js.native
  
  /**
    * Operation name
    */
  var operation: String = js.native
  
  /**
    * Room id
    */
  var room: String = js.native
  
  /**
    * Error description
    */
  var text: String = js.native
}
object ChatRoomError {
  
  @scala.inline
  def apply(code: String, operation: String, room: String, text: String): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomError]
  }
  
  @scala.inline
  implicit class ChatRoomErrorMutableBuilder[Self <: ChatRoomError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

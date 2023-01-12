package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event dispatched in case of error while chat room operation
  */
trait ChatRoomError
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Error code
    */
  var code: String
  
  /**
    * Operation name
    */
  var operation: String
  
  /**
    * Room id
    */
  var room: String
  
  /**
    * Error description
    */
  var text: String
}
object ChatRoomError {
  
  inline def apply(code: String, operation: String, room: String, text: String): ChatRoomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRoomError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

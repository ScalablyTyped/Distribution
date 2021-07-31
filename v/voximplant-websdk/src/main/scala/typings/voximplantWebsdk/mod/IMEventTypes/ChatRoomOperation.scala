package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatRoomOperationType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat room participant was banned/unbanned
  */
trait ChatRoomOperation
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * Operation type
    */
  var operation: ChatRoomOperationType
  
  /**
    * Operation result: true/false - success/failure
    */
  var result: Boolean
  
  /**
    * Room id
    */
  var room: String
}
object ChatRoomOperation {
  
  @scala.inline
  def apply(operation: ChatRoomOperationType, result: Boolean, room: String): ChatRoomOperation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomOperation]
  }
  
  @scala.inline
  implicit class ChatRoomOperationMutableBuilder[Self <: ChatRoomOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: ChatRoomOperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
  }
}

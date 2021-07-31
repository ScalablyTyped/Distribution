package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomMemberOperationResult extends StObject {
  
  var format: String
  
  var message: String
}
object RoomMemberOperationResult {
  
  @scala.inline
  def apply(format: String, message: String): RoomMemberOperationResult = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomMemberOperationResult]
  }
  
  @scala.inline
  implicit class RoomMemberOperationResultMutableBuilder[Self <: RoomMemberOperationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

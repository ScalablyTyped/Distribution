package typings.vscodeJsonrpc.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LSPLogMessage extends StObject {
  
  var message: RequestMessage | ResponseMessage | NotificationMessage = js.native
  
  var timestamp: Double = js.native
  
  var `type`: LSPMessageType = js.native
}
object LSPLogMessage {
  
  @scala.inline
  def apply(
    message: RequestMessage | ResponseMessage | NotificationMessage,
    timestamp: Double,
    `type`: LSPMessageType
  ): LSPLogMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSPLogMessage]
  }
  
  @scala.inline
  implicit class LSPLogMessageMutableBuilder[Self <: LSPLogMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: RequestMessage | ResponseMessage | NotificationMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LSPMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

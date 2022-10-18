package typings.vscodeJsonrpc.libCommonMessagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LSPLogMessage extends StObject {
  
  var message: RequestMessage | ResponseMessage | NotificationMessage
  
  var timestamp: Double
  
  var `type`: LSPMessageType
}
object LSPLogMessage {
  
  inline def apply(
    message: RequestMessage | ResponseMessage | NotificationMessage,
    timestamp: Double,
    `type`: LSPMessageType
  ): LSPLogMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LSPLogMessage]
  }
  
  extension [Self <: LSPLogMessage](x: Self) {
    
    inline def setMessage(value: RequestMessage | ResponseMessage | NotificationMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: LSPMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

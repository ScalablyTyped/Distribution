package typings.twilsock.mod.Messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message
  extends StObject
     with AbstractMessage {
  
  val active_grant: String
  
  val http_request: Request
  
  val method: MessageType
  
  val payload_type: String
}
object Message {
  
  inline def apply(active_grant: String, http_request: Request, id: String, method: MessageType, payload_type: String): Message = {
    val __obj = js.Dynamic.literal(active_grant = active_grant.asInstanceOf[js.Any], http_request = http_request.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], payload_type = payload_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setActive_grant(value: String): Self = StObject.set(x, "active_grant", value.asInstanceOf[js.Any])
    
    inline def setHttp_request(value: Request): Self = StObject.set(x, "http_request", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPayload_type(value: String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
  }
}

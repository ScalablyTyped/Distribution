package typings.twilsock.mod.Messages

import typings.twilsock.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reply
  extends StObject
     with AbstractMessage {
  
  val body: Any
  
  val header: Any
  
  val method: /* "reply" */ String
  
  val payload_type: /* "application/json" */ String
  
  val status: Status
}
object Reply {
  
  inline def apply(
    body: Any,
    header: Any,
    id: String,
    method: /* "reply" */ String,
    payload_type: /* "application/json" */ String,
    status: Status
  ): Reply = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], payload_type = payload_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reply] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: /* "reply" */ String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPayload_type(value: /* "application/json" */ String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

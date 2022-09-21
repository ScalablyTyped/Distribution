package typings.twilsock.mod.Messages

import typings.twilsock.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplyType extends StObject {
  
  var body: String
  
  var header: Header
  
  var id: String
  
  var method: js.UndefOr[MessageType] = js.undefined
  
  var payload_type: js.UndefOr[String] = js.undefined
  
  var status: Code
}
object ReplyType {
  
  inline def apply(body: String, header: Header, id: String, status: Code): ReplyType = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplyType]
  }
  
  extension [Self <: ReplyType](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPayload_type(value: String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
    
    inline def setPayload_typeUndefined: Self = StObject.set(x, "payload_type", js.undefined)
    
    inline def setStatus(value: Code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

package typings.twilsock.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var active_grant: js.UndefOr[String] = js.undefined
  
  var capabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  var client_update_type: js.UndefOr[String] = js.undefined
  
  var continuation_token: js.UndefOr[String | Null] = js.undefined
  
  var continuation_token_status: js.UndefOr[Record[String, Any]] = js.undefined
  
  var events: js.UndefOr[js.Array[Any]] = js.undefined
  
  var http_headers: js.UndefOr[Headers] = js.undefined
  
  var http_request: js.UndefOr[Request] = js.undefined
  
  var http_status: js.UndefOr[Record[String, Any]] = js.undefined
  
  var id: String
  
  var message_type: js.UndefOr[String] = js.undefined
  
  var method: MessageType
  
  var notification_ctx_id: js.UndefOr[String] = js.undefined
  
  var offline_storage: js.UndefOr[Record[String, Any]] = js.undefined
  
  var payload_size: js.UndefOr[Double] = js.undefined
  
  var payload_type: js.UndefOr[String] = js.undefined
  
  var status: StatusType
  
  var token: js.UndefOr[String] = js.undefined
}
object Header {
  
  inline def apply(id: String, method: MessageType, status: StatusType): Header = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setActive_grant(value: String): Self = StObject.set(x, "active_grant", value.asInstanceOf[js.Any])
    
    inline def setActive_grantUndefined: Self = StObject.set(x, "active_grant", js.undefined)
    
    inline def setCapabilities(value: js.Array[String]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: String*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setClient_update_type(value: String): Self = StObject.set(x, "client_update_type", value.asInstanceOf[js.Any])
    
    inline def setClient_update_typeUndefined: Self = StObject.set(x, "client_update_type", js.undefined)
    
    inline def setContinuation_token(value: String): Self = StObject.set(x, "continuation_token", value.asInstanceOf[js.Any])
    
    inline def setContinuation_tokenNull: Self = StObject.set(x, "continuation_token", null)
    
    inline def setContinuation_tokenUndefined: Self = StObject.set(x, "continuation_token", js.undefined)
    
    inline def setContinuation_token_status(value: Record[String, Any]): Self = StObject.set(x, "continuation_token_status", value.asInstanceOf[js.Any])
    
    inline def setContinuation_token_statusUndefined: Self = StObject.set(x, "continuation_token_status", js.undefined)
    
    inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHttp_headers(value: Headers): Self = StObject.set(x, "http_headers", value.asInstanceOf[js.Any])
    
    inline def setHttp_headersUndefined: Self = StObject.set(x, "http_headers", js.undefined)
    
    inline def setHttp_request(value: Request): Self = StObject.set(x, "http_request", value.asInstanceOf[js.Any])
    
    inline def setHttp_requestUndefined: Self = StObject.set(x, "http_request", js.undefined)
    
    inline def setHttp_status(value: Record[String, Any]): Self = StObject.set(x, "http_status", value.asInstanceOf[js.Any])
    
    inline def setHttp_statusUndefined: Self = StObject.set(x, "http_status", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
    
    inline def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNotification_ctx_id(value: String): Self = StObject.set(x, "notification_ctx_id", value.asInstanceOf[js.Any])
    
    inline def setNotification_ctx_idUndefined: Self = StObject.set(x, "notification_ctx_id", js.undefined)
    
    inline def setOffline_storage(value: Record[String, Any]): Self = StObject.set(x, "offline_storage", value.asInstanceOf[js.Any])
    
    inline def setOffline_storageUndefined: Self = StObject.set(x, "offline_storage", js.undefined)
    
    inline def setPayload_size(value: Double): Self = StObject.set(x, "payload_size", value.asInstanceOf[js.Any])
    
    inline def setPayload_sizeUndefined: Self = StObject.set(x, "payload_size", js.undefined)
    
    inline def setPayload_type(value: String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
    
    inline def setPayload_typeUndefined: Self = StObject.set(x, "payload_type", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

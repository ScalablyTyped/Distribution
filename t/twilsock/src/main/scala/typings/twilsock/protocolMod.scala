package typings.twilsock

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMod {
  
  object Protocol {
    
    trait Address extends StObject {
      
      var headers: Headers
      
      var host: String
      
      var method: Method
      
      var params: Params
      
      var path: String
    }
    object Address {
      
      inline def apply(headers: Headers, host: String, method: Method, params: Params, path: String): Address = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Address]
      }
      
      extension [Self <: Address](x: Self) {
        
        inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
    
    trait Context extends StObject
    
    trait Header extends StObject {
      
      var http_request: js.UndefOr[Request] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var method: MessageType
      
      var notification_ctx_id: js.UndefOr[String] = js.undefined
      
      var payload_size: js.UndefOr[Double] = js.undefined
      
      var payload_type: js.UndefOr[String] = js.undefined
    }
    object Header {
      
      inline def apply(method: MessageType): Header = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[Header]
      }
      
      extension [Self <: Header](x: Self) {
        
        inline def setHttp_request(value: Request): Self = StObject.set(x, "http_request", value.asInstanceOf[js.Any])
        
        inline def setHttp_requestUndefined: Self = StObject.set(x, "http_request", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setNotification_ctx_id(value: String): Self = StObject.set(x, "notification_ctx_id", value.asInstanceOf[js.Any])
        
        inline def setNotification_ctx_idUndefined: Self = StObject.set(x, "notification_ctx_id", js.undefined)
        
        inline def setPayload_size(value: Double): Self = StObject.set(x, "payload_size", value.asInstanceOf[js.Any])
        
        inline def setPayload_sizeUndefined: Self = StObject.set(x, "payload_size", js.undefined)
        
        inline def setPayload_type(value: String): Self = StObject.set(x, "payload_type", value.asInstanceOf[js.Any])
        
        inline def setPayload_typeUndefined: Self = StObject.set(x, "payload_type", js.undefined)
      }
    }
    
    type Headers = StringDictionary[String]
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilsock.twilsockStrings.notification
      - typings.twilsock.twilsockStrings.message
      - typings.twilsock.twilsockStrings.reply
      - typings.twilsock.twilsockStrings.ping
      - typings.twilsock.twilsockStrings.close
      - typings.twilsock.twilsockStrings.init
      - typings.twilsock.twilsockStrings.telemetryDotv1
    */
    trait MessageType extends StObject
    object MessageType {
      
      inline def close: typings.twilsock.twilsockStrings.close = "close".asInstanceOf[typings.twilsock.twilsockStrings.close]
      
      inline def init: typings.twilsock.twilsockStrings.init = "init".asInstanceOf[typings.twilsock.twilsockStrings.init]
      
      inline def message: typings.twilsock.twilsockStrings.message = "message".asInstanceOf[typings.twilsock.twilsockStrings.message]
      
      inline def notification: typings.twilsock.twilsockStrings.notification = "notification".asInstanceOf[typings.twilsock.twilsockStrings.notification]
      
      inline def ping: typings.twilsock.twilsockStrings.ping = "ping".asInstanceOf[typings.twilsock.twilsockStrings.ping]
      
      inline def reply: typings.twilsock.twilsockStrings.reply = "reply".asInstanceOf[typings.twilsock.twilsockStrings.reply]
      
      inline def telemetryDotv1: typings.twilsock.twilsockStrings.telemetryDotv1 = "telemetry.v1".asInstanceOf[typings.twilsock.twilsockStrings.telemetryDotv1]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.twilsock.twilsockStrings.GET
      - typings.twilsock.twilsockStrings.POST
      - typings.twilsock.twilsockStrings.PUT
      - typings.twilsock.twilsockStrings.DELETE
      - typings.twilsock.twilsockStrings.put_notification_ctx
      - typings.twilsock.twilsockStrings.delete_notification_ctx
    */
    trait Method extends StObject
    object Method {
      
      inline def DELETE: typings.twilsock.twilsockStrings.DELETE = "DELETE".asInstanceOf[typings.twilsock.twilsockStrings.DELETE]
      
      inline def GET: typings.twilsock.twilsockStrings.GET = "GET".asInstanceOf[typings.twilsock.twilsockStrings.GET]
      
      inline def POST: typings.twilsock.twilsockStrings.POST = "POST".asInstanceOf[typings.twilsock.twilsockStrings.POST]
      
      inline def PUT: typings.twilsock.twilsockStrings.PUT = "PUT".asInstanceOf[typings.twilsock.twilsockStrings.PUT]
      
      inline def delete_notification_ctx: typings.twilsock.twilsockStrings.delete_notification_ctx = "delete_notification_ctx".asInstanceOf[typings.twilsock.twilsockStrings.delete_notification_ctx]
      
      inline def put_notification_ctx: typings.twilsock.twilsockStrings.put_notification_ctx = "put_notification_ctx".asInstanceOf[typings.twilsock.twilsockStrings.put_notification_ctx]
    }
    
    type Params = StringDictionary[String]
    
    trait Request extends StObject {
      
      var headers: Headers
      
      var host: String
      
      var method: Method
      
      var params: Params
      
      var path: String
    }
    object Request {
      
      inline def apply(headers: Headers, host: String, method: Method, params: Params, path: String): Request = {
        val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
}

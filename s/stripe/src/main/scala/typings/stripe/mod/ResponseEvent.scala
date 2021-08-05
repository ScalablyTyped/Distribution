package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseEvent extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var api_version: String
  
  var elapsed: Double
  
  var idempotency_key: js.UndefOr[String] = js.undefined
  
  var method: String
  
  var path: String
  
  var request_end_time: Double
  
  var request_id: String
  
  var request_start_time: Double
  
  var status: Double
}
object ResponseEvent {
  
  inline def apply(
    api_version: String,
    elapsed: Double,
    method: String,
    path: String,
    request_end_time: Double,
    request_id: String,
    request_start_time: Double,
    status: Double
  ): ResponseEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request_end_time = request_end_time.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], request_start_time = request_start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseEvent]
  }
  
  extension [Self <: ResponseEvent](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setIdempotency_key(value: String): Self = StObject.set(x, "idempotency_key", value.asInstanceOf[js.Any])
    
    inline def setIdempotency_keyUndefined: Self = StObject.set(x, "idempotency_key", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRequest_end_time(value: Double): Self = StObject.set(x, "request_end_time", value.asInstanceOf[js.Any])
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_start_time(value: Double): Self = StObject.set(x, "request_start_time", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

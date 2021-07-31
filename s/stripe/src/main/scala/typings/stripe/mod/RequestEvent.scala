package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEvent extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var api_version: String
  
  var idempotency_key: js.UndefOr[String] = js.undefined
  
  var method: String
  
  var path: String
  
  var request_start_time: Double
}
object RequestEvent {
  
  @scala.inline
  def apply(api_version: String, method: String, path: String, request_start_time: Double): RequestEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request_start_time = request_start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent]
  }
  
  @scala.inline
  implicit class RequestEventMutableBuilder[Self <: RequestEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setApi_version(value: String): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotency_key(value: String): Self = StObject.set(x, "idempotency_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotency_keyUndefined: Self = StObject.set(x, "idempotency_key", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_start_time(value: Double): Self = StObject.set(x, "request_start_time", value.asInstanceOf[js.Any])
  }
}

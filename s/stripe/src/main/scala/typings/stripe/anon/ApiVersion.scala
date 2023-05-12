package typings.stripe.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiVersion extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var headers: StringDictionary[String]
  
  var idempotencyKey: js.UndefOr[String] = js.undefined
  
  var requestId: String
  
  var statusCode: Double
  
  var stripeAccount: js.UndefOr[String] = js.undefined
}
object ApiVersion {
  
  inline def apply(headers: StringDictionary[String], requestId: String, statusCode: Double): ApiVersion = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiVersion] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyKey(value: String): Self = StObject.set(x, "idempotencyKey", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyKeyUndefined: Self = StObject.set(x, "idempotencyKey", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
    
    inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
  }
}

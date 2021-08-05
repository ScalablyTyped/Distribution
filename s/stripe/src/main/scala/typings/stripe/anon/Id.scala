package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  /**
    * ID of the API request that caused the event. If null, the event was
    * automatic (e.g., Stripe’s automatic subscription handling). Request logs
    * are available in the dashboard, but currently not in the API.
    */
  var id: String | Null
  
  /**
    * The idempotency key transmitted during the request, if any.
    * Note: This property is populated only for events on or after May 23, 2017.
    */
  var idempotency_key: js.UndefOr[String | Null] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal(id = null)
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdempotency_key(value: String): Self = StObject.set(x, "idempotency_key", value.asInstanceOf[js.Any])
    
    inline def setIdempotency_keyNull: Self = StObject.set(x, "idempotency_key", null)
    
    inline def setIdempotency_keyUndefined: Self = StObject.set(x, "idempotency_key", js.undefined)
  }
}

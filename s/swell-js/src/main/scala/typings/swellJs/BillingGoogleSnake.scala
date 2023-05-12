package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGoogleSnake extends StObject {
  
  var gateway: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
}
object BillingGoogleSnake {
  
  inline def apply(): BillingGoogleSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGoogleSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingGoogleSnake] (val x: Self) extends AnyVal {
    
    inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
  }
}

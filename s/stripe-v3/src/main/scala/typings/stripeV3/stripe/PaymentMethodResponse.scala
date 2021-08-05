package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentMethod.PaymentMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethodResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var paymentMethod: js.UndefOr[PaymentMethod] = js.undefined
}
object PaymentMethodResponse {
  
  inline def apply(): PaymentMethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentMethodResponse]
  }
  
  extension [Self <: PaymentMethodResponse](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPaymentMethod(value: PaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}

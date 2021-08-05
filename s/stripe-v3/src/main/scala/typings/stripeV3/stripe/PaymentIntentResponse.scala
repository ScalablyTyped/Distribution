package typings.stripeV3.stripe

import typings.stripeV3.stripe.paymentIntents.PaymentIntent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentIntentResponse extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var paymentIntent: js.UndefOr[PaymentIntent] = js.undefined
}
object PaymentIntentResponse {
  
  inline def apply(): PaymentIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentIntentResponse]
  }
  
  extension [Self <: PaymentIntentResponse](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPaymentIntent(value: PaymentIntent): Self = StObject.set(x, "paymentIntent", value.asInstanceOf[js.Any])
    
    inline def setPaymentIntentUndefined: Self = StObject.set(x, "paymentIntent", js.undefined)
  }
}

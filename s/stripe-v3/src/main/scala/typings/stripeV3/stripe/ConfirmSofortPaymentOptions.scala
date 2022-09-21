package typings.stripeV3.stripe

import typings.stripeV3.anon.Sofort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSofortPaymentOptions
  extends StObject
     with ConfirmPaymentIntentOptions {
  
  /**
    * Either the id of an existing PaymentMethod, or an object containing
    * data to create a PaymentMethod with.
    */
  var payment_method: js.UndefOr[String | Sofort] = js.undefined
}
object ConfirmSofortPaymentOptions {
  
  inline def apply(): ConfirmSofortPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSofortPaymentOptions]
  }
  
  extension [Self <: ConfirmSofortPaymentOptions](x: Self) {
    
    inline def setPayment_method(value: String | Sofort): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}

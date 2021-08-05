package typings.stripeV3.anon

import typings.stripeV3.stripe.paymentMethod.PaymentMethodDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charge extends StObject {
  
  var charge: js.UndefOr[String | Null] = js.undefined
  
  var payment_method_details: js.UndefOr[PaymentMethodDetails | Null] = js.undefined
}
object Charge {
  
  inline def apply(): Charge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Charge]
  }
  
  extension [Self <: Charge](x: Self) {
    
    inline def setCharge(value: String): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setChargeNull: Self = StObject.set(x, "charge", null)
    
    inline def setChargeUndefined: Self = StObject.set(x, "charge", js.undefined)
    
    inline def setPayment_method_details(value: PaymentMethodDetails): Self = StObject.set(x, "payment_method_details", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_detailsNull: Self = StObject.set(x, "payment_method_details", null)
    
    inline def setPayment_method_detailsUndefined: Self = StObject.set(x, "payment_method_details", js.undefined)
  }
}

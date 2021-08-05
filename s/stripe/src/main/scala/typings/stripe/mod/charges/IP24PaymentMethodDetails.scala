package typings.stripe.mod.charges

import typings.stripe.stripeStrings.p24
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IP24PaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: p24
}
object IP24PaymentMethodDetails {
  
  inline def apply(): IP24PaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("p24")
    __obj.asInstanceOf[IP24PaymentMethodDetails]
  }
  
  extension [Self <: IP24PaymentMethodDetails](x: Self) {
    
    inline def setType(value: p24): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

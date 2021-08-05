package typings.stripe.mod.charges

import typings.stripe.stripeStrings.sofort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISofortPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: sofort
}
object ISofortPaymentMethodDetails {
  
  inline def apply(): ISofortPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("sofort")
    __obj.asInstanceOf[ISofortPaymentMethodDetails]
  }
  
  extension [Self <: ISofortPaymentMethodDetails](x: Self) {
    
    inline def setType(value: sofort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.stripe.mod.charges

import typings.stripe.stripeStrings.giropay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGiropayPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: giropay
}
object IGiropayPaymentMethodDetails {
  
  inline def apply(): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("giropay")
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
  
  extension [Self <: IGiropayPaymentMethodDetails](x: Self) {
    
    inline def setType(value: giropay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

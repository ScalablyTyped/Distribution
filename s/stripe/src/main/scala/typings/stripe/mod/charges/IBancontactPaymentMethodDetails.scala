package typings.stripe.mod.charges

import typings.stripe.stripeStrings.bancontact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBancontactPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: bancontact
}
object IBancontactPaymentMethodDetails {
  
  inline def apply(): IBancontactPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("bancontact")
    __obj.asInstanceOf[IBancontactPaymentMethodDetails]
  }
  
  extension [Self <: IBancontactPaymentMethodDetails](x: Self) {
    
    inline def setType(value: bancontact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

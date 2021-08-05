package typings.stripe.mod.charges

import typings.stripe.stripeStrings.klarna
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKlarnaPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: klarna
}
object IKlarnaPaymentMethodDetails {
  
  inline def apply(): IKlarnaPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("klarna")
    __obj.asInstanceOf[IKlarnaPaymentMethodDetails]
  }
  
  extension [Self <: IKlarnaPaymentMethodDetails](x: Self) {
    
    inline def setType(value: klarna): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

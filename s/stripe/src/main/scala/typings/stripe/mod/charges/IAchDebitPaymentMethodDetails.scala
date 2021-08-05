package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ach_debit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAchDebitPaymentMethodDetails
  extends StObject
     with IPaymentMethodDetails {
  
  var `type`: ach_debit
}
object IAchDebitPaymentMethodDetails {
  
  inline def apply(): IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ach_debit")
    __obj.asInstanceOf[IAchDebitPaymentMethodDetails]
  }
  
  extension [Self <: IAchDebitPaymentMethodDetails](x: Self) {
    
    inline def setType(value: ach_debit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

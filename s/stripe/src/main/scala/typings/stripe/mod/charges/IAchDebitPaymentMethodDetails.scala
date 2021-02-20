package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ach_debit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAchDebitPaymentMethodDetails extends IPaymentMethodDetails {
  
  var `type`: ach_debit = js.native
}
object IAchDebitPaymentMethodDetails {
  
  @scala.inline
  def apply(`type`: ach_debit): IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchDebitPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IAchDebitPaymentMethodDetailsMutableBuilder[Self <: IAchDebitPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ach_debit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

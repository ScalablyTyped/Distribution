package typings.stripe.mod.charges

import typings.stripe.anon.Accountnumber
import typings.stripe.stripeStrings.ach_credit_transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAchCreditTransferPaymentMethodDetails extends IPaymentMethodDetails {
  
  var ach_credit_transfer: Accountnumber = js.native
  
  var `type`: ach_credit_transfer = js.native
}
object IAchCreditTransferPaymentMethodDetails {
  
  @scala.inline
  def apply(ach_credit_transfer: Accountnumber, `type`: ach_credit_transfer): IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchCreditTransferPaymentMethodDetails]
  }
  
  @scala.inline
  implicit class IAchCreditTransferPaymentMethodDetailsMutableBuilder[Self <: IAchCreditTransferPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAch_credit_transfer(value: Accountnumber): Self = StObject.set(x, "ach_credit_transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ach_credit_transfer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

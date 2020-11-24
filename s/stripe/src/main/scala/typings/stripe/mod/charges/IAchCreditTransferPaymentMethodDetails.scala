package typings.stripe.mod.charges

import typings.stripe.anon.Accountnumber
import typings.stripe.stripeStrings.ach_credit_transfer
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
  implicit class IAchCreditTransferPaymentMethodDetailsOps[Self <: IAchCreditTransferPaymentMethodDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAch_credit_transfer(value: Accountnumber): Self = this.set("ach_credit_transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ach_credit_transfer): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

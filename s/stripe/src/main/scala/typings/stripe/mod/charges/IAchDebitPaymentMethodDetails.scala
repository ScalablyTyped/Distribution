package typings.stripe.mod.charges

import typings.stripe.stripeStrings.ach_debit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IAchDebitPaymentMethodDetailsOps[Self <: IAchDebitPaymentMethodDetails] (val x: Self) extends AnyVal {
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
    def setType(value: ach_debit): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


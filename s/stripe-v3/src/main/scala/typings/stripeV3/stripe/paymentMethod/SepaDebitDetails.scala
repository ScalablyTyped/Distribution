package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SepaDebitDetails extends js.Object {
  var bank_code: String = js.native
  var branch_code: String = js.native
  var country: String = js.native
  var fingerprint: String = js.native
  var last4: String = js.native
}

object SepaDebitDetails {
  @scala.inline
  def apply(bank_code: String, branch_code: String, country: String, fingerprint: String, last4: String): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SepaDebitDetails]
  }
  @scala.inline
  implicit class SepaDebitDetailsOps[Self <: SepaDebitDetails] (val x: Self) extends AnyVal {
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
    def setBank_code(value: String): Self = this.set("bank_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranch_code(value: String): Self = this.set("branch_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
  }
  
}


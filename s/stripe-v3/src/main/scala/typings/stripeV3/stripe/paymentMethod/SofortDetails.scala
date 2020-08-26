package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SofortDetails extends js.Object {
  var bank_code: String = js.native
  var bank_name: String = js.native
  var bic: String = js.native
  var country: String = js.native
  var iban_last4: String = js.native
  var verified_name: String = js.native
}

object SofortDetails {
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    country: String,
    iban_last4: String,
    verified_name: String
  ): SofortDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SofortDetails]
  }
  @scala.inline
  implicit class SofortDetailsOps[Self <: SofortDetails] (val x: Self) extends AnyVal {
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
    def setBank_name(value: String): Self = this.set("bank_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBic(value: String): Self = this.set("bic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setIban_last4(value: String): Self = this.set("iban_last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
  }
  
}


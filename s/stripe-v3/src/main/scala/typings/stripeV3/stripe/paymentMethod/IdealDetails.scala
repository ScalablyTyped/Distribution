package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.abn_amro
import typings.stripeV3.stripeV3Strings.asn_bank
import typings.stripeV3.stripeV3Strings.bunq
import typings.stripeV3.stripeV3Strings.handelsbanken
import typings.stripeV3.stripeV3Strings.ing
import typings.stripeV3.stripeV3Strings.knab
import typings.stripeV3.stripeV3Strings.moneyou
import typings.stripeV3.stripeV3Strings.rabobank
import typings.stripeV3.stripeV3Strings.regiobank
import typings.stripeV3.stripeV3Strings.sns_bank
import typings.stripeV3.stripeV3Strings.triodos_bank
import typings.stripeV3.stripeV3Strings.van_lanschot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdealDetails extends js.Object {
  var bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot = js.native
  var bic: String = js.native
  var iban_last4: String = js.native
  var verified_name: String = js.native
}

object IdealDetails {
  @scala.inline
  def apply(
    bank: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot,
    bic: String,
    iban_last4: String,
    verified_name: String
  ): IdealDetails = {
    val __obj = js.Dynamic.literal(bank = bank.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdealDetails]
  }
  @scala.inline
  implicit class IdealDetailsOps[Self <: IdealDetails] (val x: Self) extends AnyVal {
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
    def setBank(
      value: abn_amro | asn_bank | bunq | handelsbanken | ing | knab | moneyou | rabobank | regiobank | sns_bank | triodos_bank | van_lanschot
    ): Self = this.set("bank", value.asInstanceOf[js.Any])
    @scala.inline
    def setBic(value: String): Self = this.set("bic", value.asInstanceOf[js.Any])
    @scala.inline
    def setIban_last4(value: String): Self = this.set("iban_last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified_name(value: String): Self = this.set("verified_name", value.asInstanceOf[js.Any])
  }
  
}


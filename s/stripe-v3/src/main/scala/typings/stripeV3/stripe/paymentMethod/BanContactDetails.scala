package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.de
import typings.stripeV3.stripeV3Strings.en
import typings.stripeV3.stripeV3Strings.fr
import typings.stripeV3.stripeV3Strings.nl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanContactDetails extends js.Object {
  var bank_code: String
  var bank_name: String
  var bic: String
  var iban_last4: String
  var preferred_language: en | de | fr | nl
  var verified_name: String
}

object BanContactDetails {
  @scala.inline
  def apply(
    bank_code: String,
    bank_name: String,
    bic: String,
    iban_last4: String,
    preferred_language: en | de | fr | nl,
    verified_name: String
  ): BanContactDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], iban_last4 = iban_last4.asInstanceOf[js.Any], preferred_language = preferred_language.asInstanceOf[js.Any], verified_name = verified_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanContactDetails]
  }
}


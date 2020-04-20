package typings.stripeV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SepaDebitDetails extends js.Object {
  var bank_code: String
  var branch_code: String
  var country: String
  var fingerprint: String
  var last4: String
}

object SepaDebitDetails {
  @scala.inline
  def apply(bank_code: String, branch_code: String, country: String, fingerprint: String, last4: String): SepaDebitDetails = {
    val __obj = js.Dynamic.literal(bank_code = bank_code.asInstanceOf[js.Any], branch_code = branch_code.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[SepaDebitDetails]
  }
}


package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripeV3Strings.company
import typings.stripeV3.stripeV3Strings.individual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchDebitDetails extends js.Object {
  var account_holder_type: individual | company
  var bank_name: String
  var country: String
  var fingerprint: String
  var last4: String
  var routing_number: String
}

object AchDebitDetails {
  @scala.inline
  def apply(
    account_holder_type: individual | company,
    bank_name: String,
    country: String,
    fingerprint: String,
    last4: String,
    routing_number: String
  ): AchDebitDetails = {
    val __obj = js.Dynamic.literal(account_holder_type = account_holder_type.asInstanceOf[js.Any], bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AchDebitDetails]
  }
}


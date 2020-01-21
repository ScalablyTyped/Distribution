package typings.stripe.mod.charges

import typings.stripe.AnonAccountnumber
import typings.stripe.stripeStrings.ach_credit_transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAchCreditTransferPaymentMethodDetails extends IPaymentMethodDetails {
  var ach_credit_transfer: AnonAccountnumber
  var `type`: ach_credit_transfer
}

object IAchCreditTransferPaymentMethodDetails {
  @scala.inline
  def apply(ach_credit_transfer: AnonAccountnumber, `type`: ach_credit_transfer): IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAchCreditTransferPaymentMethodDetails]
  }
}


package typings.stripe.stripeMod.chargesNs

import typings.stripe.Anon_Accountnumber
import typings.stripe.stripeStrings.ach_credit_transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAchCreditTransferPaymentMethodDetails extends IPaymentMethodDetails {
  var ach_credit_transfer: Anon_Accountnumber
  var `type`: ach_credit_transfer
}

object IAchCreditTransferPaymentMethodDetails {
  @scala.inline
  def apply(ach_credit_transfer: Anon_Accountnumber, `type`: ach_credit_transfer): IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAchCreditTransferPaymentMethodDetails]
  }
}


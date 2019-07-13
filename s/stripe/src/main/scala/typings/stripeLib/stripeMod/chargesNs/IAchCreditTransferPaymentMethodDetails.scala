package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAchCreditTransferPaymentMethodDetails extends IPaymentMethodDetails {
  var ach_credit_transfer: stripeLib.Anon_Accountnumber
  var `type`: stripeLib.stripeLibStrings.ach_credit_transfer
}

object IAchCreditTransferPaymentMethodDetails {
  @scala.inline
  def apply(
    ach_credit_transfer: stripeLib.Anon_Accountnumber,
    `type`: stripeLib.stripeLibStrings.ach_credit_transfer
  ): IAchCreditTransferPaymentMethodDetails = {
    val __obj = js.Dynamic.literal(ach_credit_transfer = ach_credit_transfer)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAchCreditTransferPaymentMethodDetails]
  }
}


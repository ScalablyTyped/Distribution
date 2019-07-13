package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAchDebitPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.ach_debit
}

object IAchDebitPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.ach_debit): IAchDebitPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAchDebitPaymentMethodDetails]
  }
}


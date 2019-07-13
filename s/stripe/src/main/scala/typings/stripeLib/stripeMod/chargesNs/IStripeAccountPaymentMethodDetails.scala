package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStripeAccountPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripeLib.stripeLibStrings.stripe_account
}

object IStripeAccountPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripeLib.stripeLibStrings.stripe_account): IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IStripeAccountPaymentMethodDetails]
  }
}


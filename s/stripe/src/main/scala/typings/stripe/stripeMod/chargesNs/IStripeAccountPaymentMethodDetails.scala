package typings.stripe.stripeMod.chargesNs

import typings.stripe.stripeStrings.stripe_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStripeAccountPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: stripe_account
}

object IStripeAccountPaymentMethodDetails {
  @scala.inline
  def apply(`type`: stripe_account): IStripeAccountPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IStripeAccountPaymentMethodDetails]
  }
}


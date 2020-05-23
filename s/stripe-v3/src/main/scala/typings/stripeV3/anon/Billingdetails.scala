package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Billingdetails extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
}

object Billingdetails {
  @scala.inline
  def apply(billing_details: BillingDetails = null): Billingdetails = {
    val __obj = js.Dynamic.literal()
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billingdetails]
  }
}


package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Billingdetails extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
}

object Billingdetails {
  @scala.inline
  def apply(): Billingdetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billingdetails]
  }
  @scala.inline
  implicit class BillingdetailsOps[Self <: Billingdetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_details: Self = this.set("billing_details", js.undefined)
  }
  
}


package typings.stripeV3.anon

import typings.stripeV3.stripe.BillingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingdetailsCard extends js.Object {
  /**
    * The billing details associated with the card. [Recommended]
    */
  var billing_details: js.UndefOr[BillingDetails] = js.native
  var card: js.UndefOr[Token] = js.native
}

object BillingdetailsCard {
  @scala.inline
  def apply(): BillingdetailsCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingdetailsCard]
  }
  @scala.inline
  implicit class BillingdetailsCardOps[Self <: BillingdetailsCard] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setCard(value: Token): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
  }
  
}


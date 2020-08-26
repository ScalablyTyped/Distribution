package typings.stripe.mod.invoices

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvoiceLineItemRetrievalOptions extends IListOptions {
  var coupon: js.UndefOr[String] = js.native
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[String] = js.native
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[String] = js.native
  var subscription_plan: js.UndefOr[String] = js.native
  var subscription_prorate: js.UndefOr[Boolean] = js.native
  var subscription_proration_date: js.UndefOr[Double] = js.native
  var subscription_quantity: js.UndefOr[Double] = js.native
  var subscription_trial_end: js.UndefOr[Double] = js.native
}

object IInvoiceLineItemRetrievalOptions {
  @scala.inline
  def apply(): IInvoiceLineItemRetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceLineItemRetrievalOptions]
  }
  @scala.inline
  implicit class IInvoiceLineItemRetrievalOptionsOps[Self <: IInvoiceLineItemRetrievalOptions] (val x: Self) extends AnyVal {
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
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    @scala.inline
    def setSubscription_plan(value: String): Self = this.set("subscription_plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_plan: Self = this.set("subscription_plan", js.undefined)
    @scala.inline
    def setSubscription_prorate(value: Boolean): Self = this.set("subscription_prorate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_prorate: Self = this.set("subscription_prorate", js.undefined)
    @scala.inline
    def setSubscription_proration_date(value: Double): Self = this.set("subscription_proration_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_proration_date: Self = this.set("subscription_proration_date", js.undefined)
    @scala.inline
    def setSubscription_quantity(value: Double): Self = this.set("subscription_quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_quantity: Self = this.set("subscription_quantity", js.undefined)
    @scala.inline
    def setSubscription_trial_end(value: Double): Self = this.set("subscription_trial_end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription_trial_end: Self = this.set("subscription_trial_end", js.undefined)
  }
  
}


package typings.stripe.mod.subscriptionItems

import typings.stripe.mod.IDataOptions
import typings.stripe.stripeStrings.always_invoice
import typings.stripe.stripeStrings.create_prorations
import typings.stripe.stripeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemDeleteOptions extends IDataOptions {
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to handle prorations when the billing cycle changes or if an item’s quantity changes.
    * Prorations can be disabled by passing none.
    */
  var proration_behavior: js.UndefOr[create_prorations | always_invoice | none] = js.native
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.native
}

object ISubscriptionItemDeleteOptions {
  @scala.inline
  def apply(): ISubscriptionItemDeleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionItemDeleteOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemDeleteOptionsOps[Self <: ISubscriptionItemDeleteOptions] (val x: Self) extends AnyVal {
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
    def setProrate(value: Boolean): Self = this.set("prorate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProrate: Self = this.set("prorate", js.undefined)
    @scala.inline
    def setProration_behavior(value: create_prorations | always_invoice | none): Self = this.set("proration_behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProration_behavior: Self = this.set("proration_behavior", js.undefined)
    @scala.inline
    def setProration_date(value: Double): Self = this.set("proration_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProration_date: Self = this.set("proration_date", js.undefined)
  }
  
}


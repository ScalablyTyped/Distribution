package typings.stripe.mod.subscriptionItems

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionItemUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The identifier of the new plan for this subscription item.
    */
  var plan: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.native
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.native
  /**
    * The quantity you’d like to apply to the subscription item you’re creating.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ISubscriptionItemUpdateOptions {
  @scala.inline
  def apply(): ISubscriptionItemUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscriptionItemUpdateOptions]
  }
  @scala.inline
  implicit class ISubscriptionItemUpdateOptionsOps[Self <: ISubscriptionItemUpdateOptions] (val x: Self) extends AnyVal {
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
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setProrate(value: Boolean): Self = this.set("prorate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProrate: Self = this.set("prorate", js.undefined)
    @scala.inline
    def setProration_date(value: Double): Self = this.set("proration_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProration_date: Self = this.set("proration_date", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}


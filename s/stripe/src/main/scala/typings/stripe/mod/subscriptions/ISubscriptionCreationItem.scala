package typings.stripe.mod.subscriptions

import typings.stripe.anon.Usagegte
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubscriptionCreationItem extends js.Object {
  /**
    * Define thresholds at which an invoice will be sent, and the related subscription advanced to a new billing period.
    */
  var billing_thresholds: js.UndefOr[Usagegte] = js.native
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * Plan ID for this item.
    */
  var plan: String = js.native
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.native
}

object ISubscriptionCreationItem {
  @scala.inline
  def apply(plan: String): ISubscriptionCreationItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationItem]
  }
  @scala.inline
  implicit class ISubscriptionCreationItemOps[Self <: ISubscriptionCreationItem] (val x: Self) extends AnyVal {
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
    def setBilling_thresholds(value: Usagegte): Self = this.set("billing_thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_thresholds: Self = this.set("billing_thresholds", js.undefined)
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}


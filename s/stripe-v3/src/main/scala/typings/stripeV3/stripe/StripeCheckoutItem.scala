package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeCheckoutItem extends js.Object {
  var plan: js.UndefOr[String] = js.native
  var quantity: Double = js.native
  var sku: js.UndefOr[String] = js.native
}

object StripeCheckoutItem {
  @scala.inline
  def apply(quantity: Double): StripeCheckoutItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCheckoutItem]
  }
  @scala.inline
  implicit class StripeCheckoutItemOps[Self <: StripeCheckoutItem] (val x: Self) extends AnyVal {
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
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
  }
  
}


package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutItem extends js.Object {
  var plan: js.UndefOr[String] = js.undefined
  var quantity: Double
  var sku: js.UndefOr[String] = js.undefined
}

object StripeCheckoutItem {
  @scala.inline
  def apply(quantity: Double, plan: String = null, sku: String = null): StripeCheckoutItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (sku != null) __obj.updateDynamic("sku")(sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCheckoutItem]
  }
}


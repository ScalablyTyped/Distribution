package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCreationItem extends js.Object {
  /**
    * Plan ID for this item.
    */
  var plan: java.lang.String
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object ISubscriptionCreationItem {
  @scala.inline
  def apply(plan: java.lang.String, quantity: scala.Int | scala.Double = null): ISubscriptionCreationItem = {
    val __obj = js.Dynamic.literal(plan = plan)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationItem]
  }
}


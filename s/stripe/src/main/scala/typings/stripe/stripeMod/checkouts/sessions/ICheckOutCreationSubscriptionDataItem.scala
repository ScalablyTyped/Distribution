package typings.stripe.stripeMod.checkouts.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckOutCreationSubscriptionDataItem extends js.Object {
  /**
    * Plan ID for this item.
    */
  var plan: String
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.undefined
}

object ICheckOutCreationSubscriptionDataItem {
  @scala.inline
  def apply(plan: String, quantity: Int | Double = null): ICheckOutCreationSubscriptionDataItem = {
    val __obj = js.Dynamic.literal(plan = plan)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionDataItem]
  }
}


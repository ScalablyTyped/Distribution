package typings.stripe.mod.checkouts.sessions

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
  def apply(plan: String, quantity: js.UndefOr[Double] = js.undefined): ICheckOutCreationSubscriptionDataItem = {
    val __obj = js.Dynamic.literal(plan = plan.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOutCreationSubscriptionDataItem]
  }
}


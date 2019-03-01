package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionUpdateItem extends js.Object {
  /**
    * Delete all usage for a given subscription item. Only allowed when deleted is set to true and the current plan’s
    * usage_type is metered.
    */
  var clear_usage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete the specified item if set to true.
    */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * SubscriptionItem to update.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[stripeLib.stripeMod.StripeNs.IOptionsMetadata] = js.undefined
  /**
    * Plan ID for this item.
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object ISubscriptionUpdateItem {
  @scala.inline
  def apply(
    clear_usage: js.UndefOr[scala.Boolean] = js.undefined,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    plan: java.lang.String = null,
    quantity: scala.Int | scala.Double = null
  ): ISubscriptionUpdateItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear_usage)) __obj.updateDynamic("clear_usage")(clear_usage)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (id != null) __obj.updateDynamic("id")(id)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionUpdateItem]
  }
}


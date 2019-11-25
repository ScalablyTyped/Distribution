package typings.stripe.stripeMod.subscriptions

import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionUpdateItem extends js.Object {
  /**
    * Delete all usage for a given subscription item. Only allowed when deleted is set to true and the current plan’s
    * usage_type is metered.
    */
  var clear_usage: js.UndefOr[Boolean] = js.undefined
  /**
    * Delete the specified item if set to true.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * SubscriptionItem to update.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about
    * the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * Plan ID for this item.
    */
  var plan: js.UndefOr[String] = js.undefined
  /**
    * Quantity for this item.
    */
  var quantity: js.UndefOr[Double] = js.undefined
}

object ISubscriptionUpdateItem {
  @scala.inline
  def apply(
    clear_usage: js.UndefOr[Boolean] = js.undefined,
    deleted: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    metadata: IOptionsMetadata = null,
    plan: String = null,
    quantity: Int | Double = null
  ): ISubscriptionUpdateItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear_usage)) __obj.updateDynamic("clear_usage")(clear_usage.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionUpdateItem]
  }
}


package typings
package stripeLib.stripeMod.subscriptionItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * The identifier of the plan to add to the subscription.
    */
  var plan: java.lang.String
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[scala.Double] = js.undefined
  /**
    * The quantity you’d like to apply to the subscription item you’re creating.
    */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The identifier of the subscription to modify.
    */
  var subscription: java.lang.String
}

object ISubscriptionItemCreationOptions {
  @scala.inline
  def apply(
    plan: java.lang.String,
    subscription: java.lang.String,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    prorate: js.UndefOr[scala.Boolean] = js.undefined,
    proration_date: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null
  ): ISubscriptionItemCreationOptions = {
    val __obj = js.Dynamic.literal(plan = plan, subscription = subscription)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate)
    if (proration_date != null) __obj.updateDynamic("proration_date")(proration_date.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemCreationOptions]
  }
}


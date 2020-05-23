package typings.stripe.mod.subscriptionItems

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * The identifier of the new plan for this subscription item.
    */
  var plan: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.undefined
  /**
    * The quantity you’d like to apply to the subscription item you’re creating.
    */
  var quantity: js.UndefOr[Double] = js.undefined
}

object ISubscriptionItemUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    plan: String = null,
    prorate: js.UndefOr[Boolean] = js.undefined,
    proration_date: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined
  ): ISubscriptionItemUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proration_date)) __obj.updateDynamic("proration_date")(proration_date.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemUpdateOptions]
  }
}


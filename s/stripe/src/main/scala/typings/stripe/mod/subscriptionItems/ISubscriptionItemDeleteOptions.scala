package typings.stripe.mod.subscriptionItems

import typings.stripe.mod.IDataOptions
import typings.stripe.stripeStrings.always_invoice
import typings.stripe.stripeStrings.create_prorations
import typings.stripe.stripeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemDeleteOptions extends IDataOptions {
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how to handle prorations when the billing cycle changes or if an item’s quantity changes.
    * Prorations can be disabled by passing none.
    */
  var proration_behavior: js.UndefOr[create_prorations | always_invoice | none] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[Double] = js.undefined
}

object ISubscriptionItemDeleteOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    prorate: js.UndefOr[Boolean] = js.undefined,
    proration_behavior: create_prorations | always_invoice | none = null,
    proration_date: Int | Double = null
  ): ISubscriptionItemDeleteOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate.asInstanceOf[js.Any])
    if (proration_behavior != null) __obj.updateDynamic("proration_behavior")(proration_behavior.asInstanceOf[js.Any])
    if (proration_date != null) __obj.updateDynamic("proration_date")(proration_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemDeleteOptions]
  }
}


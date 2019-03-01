package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCreationOptions extends ISubscriptionCustCreationOptions {
  /***
    * The identifier of the customer to subscribe.
    */
  var customer: java.lang.String
}

object ISubscriptionCreationOptions {
  @scala.inline
  def apply(
    customer: java.lang.String,
    application_fee_percent: scala.Int | scala.Double = null,
    billing: SubscriptionBilling = null,
    billing_cycle_anchor: scala.Int | scala.Double = null,
    coupon: java.lang.String = null,
    days_until_due: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    items: js.Array[ISubscriptionCreationItem] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    plan: java.lang.String = null,
    prorate: js.UndefOr[scala.Boolean] = js.undefined,
    quantity: scala.Int | scala.Double = null,
    source: stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions = null,
    tax_percent: scala.Int | scala.Double = null,
    trial_end: scala.Double | stripeLib.stripeLibStrings.now = null,
    trial_from_plan: js.UndefOr[scala.Boolean] = js.undefined,
    trial_period_days: scala.Int | scala.Double = null
  ): ISubscriptionCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customer")(customer)
    if (application_fee_percent != null) __obj.updateDynamic("application_fee_percent")(application_fee_percent.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing)
    if (billing_cycle_anchor != null) __obj.updateDynamic("billing_cycle_anchor")(billing_cycle_anchor.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (days_until_due != null) __obj.updateDynamic("days_until_due")(days_until_due.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (items != null) __obj.updateDynamic("items")(items)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tax_percent != null) __obj.updateDynamic("tax_percent")(tax_percent.asInstanceOf[js.Any])
    if (trial_end != null) __obj.updateDynamic("trial_end")(trial_end.asInstanceOf[js.Any])
    if (!js.isUndefined(trial_from_plan)) __obj.updateDynamic("trial_from_plan")(trial_from_plan)
    if (trial_period_days != null) __obj.updateDynamic("trial_period_days")(trial_period_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCreationOptions]
  }
}


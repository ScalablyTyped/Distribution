package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * The billing mode of the subscriptions to retrieve. Either "charge_automatically" or "send_invoice".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.undefined
  /**
    * The ID of the customer whose subscriptions will be retrieved
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the plan whose subscriptions will be retrieved
    */
  var plan: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the subscriptions to retrieve.
    */
  var status: js.UndefOr[SubscriptionStatus | stripeLib.stripeLibStrings.all] = js.undefined
}

object ISubscriptionListOptions {
  @scala.inline
  def apply(
    billing: SubscriptionBilling = null,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    customer: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    plan: java.lang.String = null,
    starting_after: java.lang.String = null,
    status: SubscriptionStatus | stripeLib.stripeLibStrings.all = null
  ): ISubscriptionListOptions = {
    val __obj = js.Dynamic.literal()
    if (billing != null) __obj.updateDynamic("billing")(billing)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionListOptions]
  }
}


package typings.stripe.stripeMod.subscriptionsNs

import typings.stripe.stripeMod.IDateFilter
import typings.stripe.stripeMod.IListOptionsCreated
import typings.stripe.stripeStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionListOptions extends IListOptionsCreated {
  /**
    * The billing mode of the subscriptions to retrieve. Either "charge_automatically" or "send_invoice".
    */
  var billing: js.UndefOr[SubscriptionBilling] = js.undefined
  /**
    * The ID of the customer whose subscriptions will be retrieved
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * The ID of the plan whose subscriptions will be retrieved
    */
  var plan: js.UndefOr[String] = js.undefined
  /**
    * The status of the subscriptions to retrieve.
    */
  var status: js.UndefOr[SubscriptionStatus | all] = js.undefined
}

object ISubscriptionListOptions {
  @scala.inline
  def apply(
    billing: SubscriptionBilling = null,
    created: String | IDateFilter = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    plan: String = null,
    starting_after: String = null,
    status: SubscriptionStatus | all = null
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


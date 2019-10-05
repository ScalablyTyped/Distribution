package typings.stripe.stripeMod.invoices

import typings.stripe.stripeMod.IDataOptions
import typings.stripe.stripeMod.subscriptions.ISubscriptionUpdateItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceUpcomingOptions extends IDataOptions {
  /**
    * The code of the coupon to apply. If a subscription or subscription_plan is provided, the invoice returned will preview updating
    * or creating a subscription with that coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming
    * invoice from among the customer’s subscriptions.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the customer whose upcoming invoice you’d like to retrieve. REQUIRED IF SUBSCRIPTION UNSET
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the subscription for which you’d like to retrieve the upcoming invoice. If not provided, but a subscription_plan
    * is provided, you will preview creating a subscription to that plan. If neither subscription nor subscription_plan is provided, you
    * will retrieve the next upcoming invoice from among the customer’s subscriptions.
    */
  var subscription: js.UndefOr[String] = js.undefined
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.undefined
  /**
    * List of subscription items, each with an attached plan.
    */
  var subscription_items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.undefined
  /**
    * If set, the invoice returned will preview updating the subscription given to this plan, or creating a new subscription to this plan
    * if no subscription is given.
    */
  var subscription_plan: js.UndefOr[String] = js.undefined
  /**
    * If previewing an update to a subscription, this decides whether the preview will show the result of applying prorations or not. If
    * set, one of subscription_plan or subscription, and one of subscription_plan, subscription_quantity or subscription_trial_end are
    * required.
    */
  var subscription_prorate: js.UndefOr[Boolean] = js.undefined
  /**
    * If previewing an update to a subscription, and doing proration, subscription_proration_date forces the proration to be calculated as
    * though the update was done at the specified time. The time given must be within the current subscription period, and cannot be
    * before the subscription was on its current plan.If set, subscription, and one of subscription_plan, subscription_quantity or
    * subscription_trial_end are required. Also, subscription_proration cannot be set to false.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that quantity. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_quantity: js.UndefOr[Double] = js.undefined
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that trial end. If set, one of subscription_plan
    * or subscription is required.
    */
  var subscription_trial_end: js.UndefOr[Double] = js.undefined
}

object IInvoiceUpcomingOptions {
  @scala.inline
  def apply(
    coupon: String = null,
    customer: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    subscription: String = null,
    subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.undefined,
    subscription_items: js.Array[ISubscriptionUpdateItem] = null,
    subscription_plan: String = null,
    subscription_prorate: js.UndefOr[Boolean] = js.undefined,
    subscription_proration_date: Int | Double = null,
    subscription_quantity: Int | Double = null,
    subscription_trial_end: Int | Double = null
  ): IInvoiceUpcomingOptions = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (!js.isUndefined(subscription_cancel_at_period_end)) __obj.updateDynamic("subscription_cancel_at_period_end")(subscription_cancel_at_period_end)
    if (subscription_items != null) __obj.updateDynamic("subscription_items")(subscription_items)
    if (subscription_plan != null) __obj.updateDynamic("subscription_plan")(subscription_plan)
    if (!js.isUndefined(subscription_prorate)) __obj.updateDynamic("subscription_prorate")(subscription_prorate)
    if (subscription_proration_date != null) __obj.updateDynamic("subscription_proration_date")(subscription_proration_date.asInstanceOf[js.Any])
    if (subscription_quantity != null) __obj.updateDynamic("subscription_quantity")(subscription_quantity.asInstanceOf[js.Any])
    if (subscription_trial_end != null) __obj.updateDynamic("subscription_trial_end")(subscription_trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceUpcomingOptions]
  }
}


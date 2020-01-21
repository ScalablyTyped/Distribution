package typings.stripe.mod.invoices

import typings.stripe.mod.IListOptions
import typings.stripe.mod.invoiceItems.InvoiceItem
import typings.stripe.mod.subscriptions.ISubscriptionUpdateItem
import typings.stripe.stripeStrings.now
import typings.stripe.stripeStrings.unchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceListUpcomingLineItemsOptions extends IListOptions {
  /**
    * The code of the coupon to apply. If subscription or subscription_items is provided, the invoice returned will preview updating or
    * creating a subscription with that coupon. Otherwise, it will preview applying that coupon to the customer for the next upcoming invoice
    * from among the customer’s subscriptions. The invoice can be previewed without a coupon by passing this value as an empty string.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the customer whose upcoming invoice you’d like to retrieve.
    * Required if subscription unset
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * array of hashes
    * List of invoice items to add or update in the upcoming invoice preview.
    */
  var invoice_items: js.UndefOr[js.Array[InvoiceItem]] = js.undefined
  /**
    * The identifier of the subscription for which you’d like to retrieve the upcoming invoice. If not
    * provided, but a subscription_items is provided, you will preview creating a subscription with
    * those items. If neither subscription nor subscription_items is provided, you will retrieve the
    * next upcoming invoice from among the customer’s subscriptions.
    */
  var subscription: js.UndefOr[String] = js.undefined
  /**
    * For new subscriptions, a future timestamp to anchor the subscription’s billing cycle. This is used to
    * determine the date of the first full invoice, and, for plans with month or year intervals, the day of
    * the month for subsequent invoices. For existing subscriptions, the value can only be set to now or
    * unchanged.
    */
  var subscription_billing_cycle_anchor: js.UndefOr[now | unchanged] = js.undefined
  /**
    * Boolean indicating when the subscription should be scheduled to cancel. Will prorate if
    * within the current period if prorate=true
    */
  var subscription_cancel_at: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean indicating whether this subscription should cancel at the end of the current period.
    */
  var subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.undefined
  var subscription_cancel_now: js.UndefOr[Boolean] = js.undefined
  /**
    * array of hashes List of subscription items, each with an attached plan.
    */
  var subscription_items: js.UndefOr[js.Array[ISubscriptionUpdateItem]] = js.undefined
  /**
    * If previewing an update to a subscription, this decides whether the preview will show the result of
    * applying prorations or not. If set, one of subscription_items or subscription, and one of
    * subscription_items or subscription_trial_end are required.
    */
  var subscription_prorate: js.UndefOr[Boolean] = js.undefined
  /**
    * If previewing an update to a subscription, and doing proration, subscription_proration_date
    * forces the proration to be calculated as though the update was done at the specified time. The time
    * given must be within the current subscription period, and cannot be before the subscription was on
    * its current plan. If set, subscription, and one of subscription_items, or subscription_trial_end are
    * required. Also, subscription_proration cannot be set to false.
    */
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  /**
    * Date a subscription is intended to start (can be future or past)
    */
  var subscription_start_date: js.UndefOr[Double] = js.undefined
  /**
    * DEPRECATED
    * If provided, the invoice returned will preview updating or creating a subscription with that tax
    * percent. If set, one of subscription_items or subscription is required. This field has been deprecated
    * and will be removed in a future API version, for further information view the migration docs for
    * tax_rates.
    */
  var subscription_tax_percent: js.UndefOr[Double] = js.undefined
  /**
    * If provided, the invoice returned will preview updating or creating a subscription with that trial end.
    * If set, one of subscription_items or subscription is required.
    */
  var subscription_trial_end: js.UndefOr[now | Double | String] = js.undefined
  /**
    * Indicates if a plan’s trial_period_days should be applied to the subscription. Setting
    * subscription_trial_end per subscription is preferred, and this defaults to false. Setting this flag to
    * true together with subscription_trial_end is not allowed.
    */
  var subscription_trial_from_plan: js.UndefOr[Boolean] = js.undefined
}

object IInvoiceListUpcomingLineItemsOptions {
  @scala.inline
  def apply(
    coupon: String = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice_items: js.Array[InvoiceItem] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    subscription: String = null,
    subscription_billing_cycle_anchor: now | unchanged = null,
    subscription_cancel_at: js.UndefOr[Boolean] = js.undefined,
    subscription_cancel_at_period_end: js.UndefOr[Boolean] = js.undefined,
    subscription_cancel_now: js.UndefOr[Boolean] = js.undefined,
    subscription_items: js.Array[ISubscriptionUpdateItem] = null,
    subscription_prorate: js.UndefOr[Boolean] = js.undefined,
    subscription_proration_date: Int | Double = null,
    subscription_start_date: Int | Double = null,
    subscription_tax_percent: Int | Double = null,
    subscription_trial_end: now | Double | String = null,
    subscription_trial_from_plan: js.UndefOr[Boolean] = js.undefined
  ): IInvoiceListUpcomingLineItemsOptions = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (invoice_items != null) __obj.updateDynamic("invoice_items")(invoice_items.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (subscription_billing_cycle_anchor != null) __obj.updateDynamic("subscription_billing_cycle_anchor")(subscription_billing_cycle_anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_cancel_at)) __obj.updateDynamic("subscription_cancel_at")(subscription_cancel_at.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_cancel_at_period_end)) __obj.updateDynamic("subscription_cancel_at_period_end")(subscription_cancel_at_period_end.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_cancel_now)) __obj.updateDynamic("subscription_cancel_now")(subscription_cancel_now.asInstanceOf[js.Any])
    if (subscription_items != null) __obj.updateDynamic("subscription_items")(subscription_items.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_prorate)) __obj.updateDynamic("subscription_prorate")(subscription_prorate.asInstanceOf[js.Any])
    if (subscription_proration_date != null) __obj.updateDynamic("subscription_proration_date")(subscription_proration_date.asInstanceOf[js.Any])
    if (subscription_start_date != null) __obj.updateDynamic("subscription_start_date")(subscription_start_date.asInstanceOf[js.Any])
    if (subscription_tax_percent != null) __obj.updateDynamic("subscription_tax_percent")(subscription_tax_percent.asInstanceOf[js.Any])
    if (subscription_trial_end != null) __obj.updateDynamic("subscription_trial_end")(subscription_trial_end.asInstanceOf[js.Any])
    if (!js.isUndefined(subscription_trial_from_plan)) __obj.updateDynamic("subscription_trial_from_plan")(subscription_trial_from_plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceListUpcomingLineItemsOptions]
  }
}


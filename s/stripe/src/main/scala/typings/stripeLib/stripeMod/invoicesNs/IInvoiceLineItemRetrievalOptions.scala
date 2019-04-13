package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceLineItemRetrievalOptions
  extends stripeLib.stripeMod.IListOptions {
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[java.lang.String] = js.undefined
  var subscription_plan: js.UndefOr[java.lang.String] = js.undefined
  var subscription_prorate: js.UndefOr[scala.Boolean] = js.undefined
  var subscription_proration_date: js.UndefOr[scala.Double] = js.undefined
  var subscription_quantity: js.UndefOr[scala.Double] = js.undefined
  var subscription_trial_end: js.UndefOr[scala.Double] = js.undefined
}

object IInvoiceLineItemRetrievalOptions {
  @scala.inline
  def apply(
    coupon: java.lang.String = null,
    customer: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null,
    subscription: java.lang.String = null,
    subscription_plan: java.lang.String = null,
    subscription_prorate: js.UndefOr[scala.Boolean] = js.undefined,
    subscription_proration_date: scala.Int | scala.Double = null,
    subscription_quantity: scala.Int | scala.Double = null,
    subscription_trial_end: scala.Int | scala.Double = null
  ): IInvoiceLineItemRetrievalOptions = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (subscription_plan != null) __obj.updateDynamic("subscription_plan")(subscription_plan)
    if (!js.isUndefined(subscription_prorate)) __obj.updateDynamic("subscription_prorate")(subscription_prorate)
    if (subscription_proration_date != null) __obj.updateDynamic("subscription_proration_date")(subscription_proration_date.asInstanceOf[js.Any])
    if (subscription_quantity != null) __obj.updateDynamic("subscription_quantity")(subscription_quantity.asInstanceOf[js.Any])
    if (subscription_trial_end != null) __obj.updateDynamic("subscription_trial_end")(subscription_trial_end.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvoiceLineItemRetrievalOptions]
  }
}


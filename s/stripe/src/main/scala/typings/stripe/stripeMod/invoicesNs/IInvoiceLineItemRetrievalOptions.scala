package typings.stripe.stripeMod.invoicesNs

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInvoiceLineItemRetrievalOptions extends IListOptions {
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[String] = js.undefined
  var subscription_plan: js.UndefOr[String] = js.undefined
  var subscription_prorate: js.UndefOr[Boolean] = js.undefined
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  var subscription_quantity: js.UndefOr[Double] = js.undefined
  var subscription_trial_end: js.UndefOr[Double] = js.undefined
}

object IInvoiceLineItemRetrievalOptions {
  @scala.inline
  def apply(
    coupon: String = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    subscription: String = null,
    subscription_plan: String = null,
    subscription_prorate: js.UndefOr[Boolean] = js.undefined,
    subscription_proration_date: Int | Double = null,
    subscription_quantity: Int | Double = null,
    subscription_trial_end: Int | Double = null
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


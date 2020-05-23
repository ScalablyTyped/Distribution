package typings.stripe.mod.subscriptions

import typings.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCancellationOptions extends IDataOptions {
  /**
    * @deprecated Use subscription update with cancel_at_period_end option as of 2018-08-23.
    *
    * A flag that if set to true will delay the cancellation of the subscription until the end of the current period.
    */
  var at_period_end: js.UndefOr[Boolean] = js.undefined
  /**
    * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice items.
    */
  var invoice_now: js.UndefOr[Boolean] = js.undefined
  /**
    * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
    */
  var prorate: js.UndefOr[Boolean] = js.undefined
}

object ISubscriptionCancellationOptions {
  @scala.inline
  def apply(
    at_period_end: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    invoice_now: js.UndefOr[Boolean] = js.undefined,
    prorate: js.UndefOr[Boolean] = js.undefined
  ): ISubscriptionCancellationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(at_period_end)) __obj.updateDynamic("at_period_end")(at_period_end.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(invoice_now)) __obj.updateDynamic("invoice_now")(invoice_now.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionCancellationOptions]
  }
}


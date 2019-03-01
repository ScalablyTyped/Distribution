package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionCancellationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
    * @deprecated Use subscription update with cancel_at_period_end option as of 2018-08-23.
    *
    * A flag that if set to true will delay the cancellation of the subscription until the end of the current period.
    */
  var at_period_end: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will generate a final invoice that invoices for any un-invoiced metered usage and new/pending proration invoice items.
    */
  var invoice_now: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will generate a proration invoice item that credits remaining unused time until the subscription period end.
    */
  var prorate: js.UndefOr[scala.Boolean] = js.undefined
}

object ISubscriptionCancellationOptions {
  @scala.inline
  def apply(
    at_period_end: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    invoice_now: js.UndefOr[scala.Boolean] = js.undefined,
    prorate: js.UndefOr[scala.Boolean] = js.undefined
  ): ISubscriptionCancellationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(at_period_end)) __obj.updateDynamic("at_period_end")(at_period_end)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(invoice_now)) __obj.updateDynamic("invoice_now")(invoice_now)
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate)
    __obj.asInstanceOf[ISubscriptionCancellationOptions]
  }
}


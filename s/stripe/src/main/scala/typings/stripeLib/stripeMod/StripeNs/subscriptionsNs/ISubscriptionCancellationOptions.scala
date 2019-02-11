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


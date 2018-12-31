package typings
package stripeLib.stripeMod.StripeNs.transferReversalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReversalCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much of this transfer to reverse. Can only reverse up to the unreversed amount
    * remaining of the transfer. Partial transfer reversals are only allowed for transfers to Stripe Accounts.
    */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * An arbitrary string which you can attach to a reversal object. It is displayed alongside the reversal in the dashboard. This will
    * be unset if you POST an empty value.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean indicating whether the application fee should be refunded when reversing this transfer. If a full transfer reversal is
    * given, the full application fee will be refunded. Otherwise, the application fee will be refunded with an amount proportional to
    * the amount of the transfer reversed.
    */
  var refund_application_fee: js.UndefOr[scala.Boolean] = js.undefined
}


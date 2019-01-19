package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalanceListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  var available_on: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For automatic Stripe payouts only, only returns transactions that were payed out on the specified payout ID.
    */
  var payout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only returns transactions that are related to the specified Stripe object ID
    * (e.g. filtering by a charge ID will return all related charge transactions).
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only returns transactions of the given type.
    */
  var `type`: js.UndefOr[
    stripeLib.stripeLibStrings.charge | stripeLib.stripeLibStrings.refund | stripeLib.stripeLibStrings.adjustment | stripeLib.stripeLibStrings.application_fee | stripeLib.stripeLibStrings.application_fee_refund | stripeLib.stripeLibStrings.transfer | stripeLib.stripeLibStrings.payment | stripeLib.stripeLibStrings.payout | stripeLib.stripeLibStrings.payout_failure | stripeLib.stripeLibStrings.stripe_fee | stripeLib.stripeLibStrings.network_cost
  ] = js.undefined
}


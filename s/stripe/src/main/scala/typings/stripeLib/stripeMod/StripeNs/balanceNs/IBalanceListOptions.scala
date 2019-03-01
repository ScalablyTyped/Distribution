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

object IBalanceListOptions {
  @scala.inline
  def apply(
    available_on: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    currency: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    payout: java.lang.String = null,
    source: java.lang.String = null,
    starting_after: java.lang.String = null,
    `type`: stripeLib.stripeLibStrings.charge | stripeLib.stripeLibStrings.refund | stripeLib.stripeLibStrings.adjustment | stripeLib.stripeLibStrings.application_fee | stripeLib.stripeLibStrings.application_fee_refund | stripeLib.stripeLibStrings.transfer | stripeLib.stripeLibStrings.payment | stripeLib.stripeLibStrings.payout | stripeLib.stripeLibStrings.payout_failure | stripeLib.stripeLibStrings.stripe_fee | stripeLib.stripeLibStrings.network_cost = null
  ): IBalanceListOptions = {
    val __obj = js.Dynamic.literal()
    if (available_on != null) __obj.updateDynamic("available_on")(available_on.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (payout != null) __obj.updateDynamic("payout")(payout)
    if (source != null) __obj.updateDynamic("source")(source)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBalanceListOptions]
  }
}


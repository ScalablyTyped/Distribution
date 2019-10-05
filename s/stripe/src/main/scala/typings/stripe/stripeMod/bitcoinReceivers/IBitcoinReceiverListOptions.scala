package typings.stripe.stripeMod.bitcoinReceivers

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitcoinReceiverListOptions extends IListOptions {
  /**
    * Filter for active receivers.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter for filled receivers.
    */
  var filled: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter for receivers with uncaptured funds.
    */
  var uncaptured_funds: js.UndefOr[Boolean] = js.undefined
}

object IBitcoinReceiverListOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    ending_before: String = null,
    expand: js.Array[String] = null,
    filled: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    uncaptured_funds: js.UndefOr[Boolean] = js.undefined
  ): IBitcoinReceiverListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (!js.isUndefined(uncaptured_funds)) __obj.updateDynamic("uncaptured_funds")(uncaptured_funds)
    __obj.asInstanceOf[IBitcoinReceiverListOptions]
  }
}


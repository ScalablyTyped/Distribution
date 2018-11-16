package typings
package stripeLib.stripeMod.StripeNs.bitcoinReceiversNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBitcoinReceiverListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  /**
               * Filter for active receivers.
               */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Filter for filled receivers.
               */
  var filled: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Filter for receivers with uncaptured funds.
               */
  var uncaptured_funds: js.UndefOr[scala.Boolean] = js.undefined
}


package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IChargeCaptureOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
               * A positive integer in the smallest currency unit (e.g 100 cents to charge
               * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
               * charge the card. The minimum amount is £0.50 (or equivalent in charge
               * currency).
               */
  var amount: js.UndefOr[scala.Double] = js.undefined
}


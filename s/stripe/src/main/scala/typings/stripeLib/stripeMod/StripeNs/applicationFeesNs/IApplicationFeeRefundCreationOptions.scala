package typings
package stripeLib.stripeMod.StripeNs.applicationFeesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IApplicationFeeRefundCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A positive integer in pence representing how much of this fee to refund.
               * Can only refund up to the unrefunded amount remaining of the fee.
               *
               * default is entire application fee
               */
  var amount: js.UndefOr[scala.Double] = js.undefined
}


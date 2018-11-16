package typings
package stripeLib.stripeMod.StripeNs.subscriptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISubscriptionCancellationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
               * A flag that if set to true will delay the cancellation of the subscription until the end of the current period.
               */
  var at_period_end: js.UndefOr[scala.Boolean] = js.undefined
}


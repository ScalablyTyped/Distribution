package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITokenCreationOptionsBase
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
               * The customer (owned by the application's account) to create a
               * token for. For use with Stripe Connect only; this can only be used
               * with an OAuth access token or Stripe-Account header. For more
               * details, see the shared customers documentation.
               *
               * Stripe connect only
               */
  var customer: js.UndefOr[java.lang.String] = js.undefined
}


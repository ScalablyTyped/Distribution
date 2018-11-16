package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExternalAccountUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * If set to true, this bank account will become the default external account for its currency.
               */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
}


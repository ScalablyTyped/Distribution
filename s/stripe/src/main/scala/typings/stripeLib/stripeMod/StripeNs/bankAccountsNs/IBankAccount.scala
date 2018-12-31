package typings
package stripeLib.stripeMod.StripeNs.bankAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccount extends IBankAccountHash {
  var account: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This indicates whether or not this bank account is the default external account for its currency.
    */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A set of key/value pairs that you can attach to a bank account object. It
    * can be useful for storing additional information about the bank account in
    * a structured format.
    */
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
}


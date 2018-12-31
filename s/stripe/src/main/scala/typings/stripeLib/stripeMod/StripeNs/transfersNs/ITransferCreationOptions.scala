package typings
package stripeLib.stripeMod.StripeNs.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A positive integer in cents/pence representing how much to transfer.
    */
  var amount: scala.Double
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * The id of a bank account or a card to send the transfer to, or the
    * string "default_for_currency" to use the default external
    * account for the specified currency.
    *
    * If you use Stripe Connect, this can be the the id of a connected
    * Stripe account; see the details about when such transfers are
    * permitted.
    */
  var destination: java.lang.String
  /**
    * You can use this parameter to transfer funds from a charge (or
    * other transaction) before they are added to your available
    * balance. A pending balance will transfer immediately but the
    * funds will not become available until the original charge
    * becomes available. See the Connect documentation for details.
    */
  var source_transaction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[java.lang.String] = js.undefined
}


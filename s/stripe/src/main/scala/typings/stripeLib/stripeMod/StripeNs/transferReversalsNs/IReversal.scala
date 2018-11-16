package typings
package stripeLib.stripeMod.StripeNs.transferReversalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IReversal
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Amount reversed, in cents/pence.
               */
  var amount: scala.Double
  /**
               * Balance transaction that describes the impact of this reversal on your account balance. [Expandable]
               */
  var balance_transaction: java.lang.String | stripeLib.stripeMod.StripeNs.balanceNs.IBalanceTransaction
  var created: scala.Double
  /**
               * Three-letter ISO currency code representing the currency.
               */
  var currency: java.lang.String
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
               * Value is 'transfer_reversal'
               */
  @JSName("object")
  var object_IReversal: stripeLib.stripeLibStrings.transfer_reversal
  /**
               * ID of the transfer that was reversed. [Expandable]
               */
  var transfer: java.lang.String | stripeLib.stripeMod.StripeNs.transfersNs.ITransfer
}


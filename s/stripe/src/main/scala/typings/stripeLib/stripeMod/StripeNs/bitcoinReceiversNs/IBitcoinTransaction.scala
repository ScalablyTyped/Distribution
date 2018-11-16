package typings
package stripeLib.stripeMod.StripeNs.bitcoinReceiversNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBitcoinTransaction
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * The amount of currency that the transaction was converted to in real-time.
               */
  var amount: scala.Double
  /**
               * The amount of bitcoin contained in the transaction.
               */
  var bitcoin_amount: scala.Double
  var created: scala.Double
  /**
               * The currency to which this transaction was converted.
               */
  var currency: java.lang.String
  /**
               * The receiver to which this transaction was sent.
               */
  var receiver: java.lang.String
}


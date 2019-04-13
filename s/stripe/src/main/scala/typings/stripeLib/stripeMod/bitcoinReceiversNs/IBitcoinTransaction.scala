package typings
package stripeLib.stripeMod.bitcoinReceiversNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitcoinTransaction
  extends stripeLib.stripeMod.IResourceObject {
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

object IBitcoinTransaction {
  @scala.inline
  def apply(
    amount: scala.Double,
    bitcoin_amount: scala.Double,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    `object`: java.lang.String,
    receiver: java.lang.String
  ): IBitcoinTransaction = {
    val __obj = js.Dynamic.literal(amount = amount, bitcoin_amount = bitcoin_amount, created = created, currency = currency, id = id, receiver = receiver)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IBitcoinTransaction]
  }
}


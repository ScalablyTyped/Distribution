package typings.stripe.mod.bitcoinReceivers

import typings.stripe.mod.IResourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitcoinTransaction extends IResourceObject {
  /**
    * The amount of currency that the transaction was converted to in real-time.
    */
  var amount: Double
  /**
    * The amount of bitcoin contained in the transaction.
    */
  var bitcoin_amount: Double
  var created: Double
  /**
    * The currency to which this transaction was converted.
    */
  var currency: String
  /**
    * The receiver to which this transaction was sent.
    */
  var receiver: String
}

object IBitcoinTransaction {
  @scala.inline
  def apply(
    amount: Double,
    bitcoin_amount: Double,
    created: Double,
    currency: String,
    id: String,
    `object`: String,
    receiver: String
  ): IBitcoinTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitcoinTransaction]
  }
}


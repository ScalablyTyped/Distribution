package typings.web3.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var blockHash: String
  var blockNumber: Double
  var from: String
  var gas: Double
  var gasPrice: String
  var hash: String
  var input: String
  var nonce: Double
  var r: js.UndefOr[String] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var to: String
  var transactionIndex: Double
  var v: js.UndefOr[String] = js.undefined
  var value: String
}

object Transaction {
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    from: String,
    gas: Double,
    gasPrice: String,
    hash: String,
    input: String,
    nonce: Double,
    to: String,
    transactionIndex: Double,
    value: String,
    r: String = null,
    s: String = null,
    v: String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, from = from, gas = gas, gasPrice = gasPrice, hash = hash, input = input, nonce = nonce, to = to, transactionIndex = transactionIndex, value = value)
    if (r != null) __obj.updateDynamic("r")(r)
    if (s != null) __obj.updateDynamic("s")(s)
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Transaction]
  }
}


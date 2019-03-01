package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var from: java.lang.String
  var gas: scala.Double
  var gasPrice: java.lang.String
  var hash: java.lang.String
  var input: java.lang.String
  var nonce: scala.Double
  var r: js.UndefOr[java.lang.String] = js.undefined
  var s: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String
  var transactionIndex: scala.Double
  var v: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Transaction {
  @scala.inline
  def apply(
    blockHash: java.lang.String,
    blockNumber: scala.Double,
    from: java.lang.String,
    gas: scala.Double,
    gasPrice: java.lang.String,
    hash: java.lang.String,
    input: java.lang.String,
    nonce: scala.Double,
    to: java.lang.String,
    transactionIndex: scala.Double,
    value: java.lang.String,
    r: java.lang.String = null,
    s: java.lang.String = null,
    v: java.lang.String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockHash")(blockHash)
    __obj.updateDynamic("blockNumber")(blockNumber)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("gas")(gas)
    __obj.updateDynamic("gasPrice")(gasPrice)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("transactionIndex")(transactionIndex)
    __obj.updateDynamic("value")(value)
    if (r != null) __obj.updateDynamic("r")(r)
    if (s != null) __obj.updateDynamic("s")(s)
    if (v != null) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Transaction]
  }
}


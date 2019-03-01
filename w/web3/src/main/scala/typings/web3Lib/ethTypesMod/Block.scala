package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends BlockHeader {
  var difficulty: scala.Double
  var size: scala.Double
  var totalDifficulty: scala.Double
  var transactions: js.Array[Transaction]
  var uncles: js.Array[java.lang.String]
}

object Block {
  @scala.inline
  def apply(
    difficulty: scala.Double,
    extraData: java.lang.String,
    gasLimit: scala.Double,
    gasUsed: scala.Double,
    hash: java.lang.String,
    logsBloom: java.lang.String,
    miner: java.lang.String,
    nonce: java.lang.String,
    number: scala.Double,
    parentHash: java.lang.String,
    receiptRoot: java.lang.String,
    sha3Uncles: java.lang.String,
    size: scala.Double,
    stateRoot: java.lang.String,
    timestamp: scala.Double,
    totalDifficulty: scala.Double,
    transactionRoot: java.lang.String,
    transactions: js.Array[Transaction],
    uncles: js.Array[java.lang.String]
  ): Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("difficulty")(difficulty)
    __obj.updateDynamic("extraData")(extraData)
    __obj.updateDynamic("gasLimit")(gasLimit)
    __obj.updateDynamic("gasUsed")(gasUsed)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("logsBloom")(logsBloom)
    __obj.updateDynamic("miner")(miner)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("parentHash")(parentHash)
    __obj.updateDynamic("receiptRoot")(receiptRoot)
    __obj.updateDynamic("sha3Uncles")(sha3Uncles)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("stateRoot")(stateRoot)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("totalDifficulty")(totalDifficulty)
    __obj.updateDynamic("transactionRoot")(transactionRoot)
    __obj.updateDynamic("transactions")(transactions)
    __obj.updateDynamic("uncles")(uncles)
    __obj.asInstanceOf[Block]
  }
}


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
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, hash = hash, logsBloom = logsBloom, miner = miner, nonce = nonce, number = number, parentHash = parentHash, receiptRoot = receiptRoot, sha3Uncles = sha3Uncles, size = size, stateRoot = stateRoot, timestamp = timestamp, totalDifficulty = totalDifficulty, transactionRoot = transactionRoot, transactions = transactions, uncles = uncles)
  
    __obj.asInstanceOf[Block]
  }
}


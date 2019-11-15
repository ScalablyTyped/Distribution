package typings.web3DashEth.web3DashEthMod

import typings.web3DashCore.web3DashCoreMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockTransactionObject extends BlockTransactionBase {
  var transactions: js.Array[Transaction]
}

object BlockTransactionObject {
  @scala.inline
  def apply(
    difficulty: Double,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    hash: String,
    logsBloom: String,
    miner: String,
    nonce: String,
    number: Double,
    parentHash: String,
    receiptRoot: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double | String,
    totalDifficulty: Double,
    transactionRoot: String,
    transactions: js.Array[Transaction],
    uncles: js.Array[String]
  ): BlockTransactionObject = {
    val __obj = js.Dynamic.literal(difficulty = difficulty, extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, hash = hash, logsBloom = logsBloom, miner = miner, nonce = nonce, number = number, parentHash = parentHash, receiptRoot = receiptRoot, sha3Uncles = sha3Uncles, size = size, stateRoot = stateRoot, timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty, transactionRoot = transactionRoot, transactions = transactions, uncles = uncles)
  
    __obj.asInstanceOf[BlockTransactionObject]
  }
}


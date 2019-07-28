package typings.web3.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockHeader extends js.Object {
  var extraData: String
  var gasLimit: Double
  var gasUsed: Double
  var hash: String
  var logsBloom: String
  var miner: String
  var nonce: String
  var number: Double
  var parentHash: String
  var receiptRoot: String
  var sha3Uncles: String
  var stateRoot: String
  var timestamp: Double
  var transactionRoot: String
}

object BlockHeader {
  @scala.inline
  def apply(
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
    stateRoot: String,
    timestamp: Double,
    transactionRoot: String
  ): BlockHeader = {
    val __obj = js.Dynamic.literal(extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, hash = hash, logsBloom = logsBloom, miner = miner, nonce = nonce, number = number, parentHash = parentHash, receiptRoot = receiptRoot, sha3Uncles = sha3Uncles, stateRoot = stateRoot, timestamp = timestamp, transactionRoot = transactionRoot)
  
    __obj.asInstanceOf[BlockHeader]
  }
}


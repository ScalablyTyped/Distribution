package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockHeader extends js.Object {
  var extraData: java.lang.String
  var gasLimit: scala.Double
  var gasUsed: scala.Double
  var hash: java.lang.String
  var logsBloom: java.lang.String
  var miner: java.lang.String
  var nonce: java.lang.String
  var number: scala.Double
  var parentHash: java.lang.String
  var receiptRoot: java.lang.String
  var sha3Uncles: java.lang.String
  var stateRoot: java.lang.String
  var timestamp: scala.Double
  var transactionRoot: java.lang.String
}

object BlockHeader {
  @scala.inline
  def apply(
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
    stateRoot: java.lang.String,
    timestamp: scala.Double,
    transactionRoot: java.lang.String
  ): BlockHeader = {
    val __obj = js.Dynamic.literal(extraData = extraData, gasLimit = gasLimit, gasUsed = gasUsed, hash = hash, logsBloom = logsBloom, miner = miner, nonce = nonce, number = number, parentHash = parentHash, receiptRoot = receiptRoot, sha3Uncles = sha3Uncles, stateRoot = stateRoot, timestamp = timestamp, transactionRoot = transactionRoot)
  
    __obj.asInstanceOf[BlockHeader]
  }
}


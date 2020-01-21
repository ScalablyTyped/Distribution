package typings.web3Eth.mod

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
  var timestamp: Double | String
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
    timestamp: Double | String,
    transactionRoot: String
  ): BlockHeader = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockHeader]
  }
}


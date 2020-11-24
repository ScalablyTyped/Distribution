package typings.web3Eth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockHeader extends js.Object {
  
  var extraData: String = js.native
  
  var gasLimit: Double = js.native
  
  var gasUsed: Double = js.native
  
  var hash: String = js.native
  
  var logsBloom: String = js.native
  
  var miner: String = js.native
  
  var nonce: String = js.native
  
  var number: Double = js.native
  
  var parentHash: String = js.native
  
  var receiptRoot: String = js.native
  
  var sha3Uncles: String = js.native
  
  var stateRoot: String = js.native
  
  var timestamp: Double | String = js.native
  
  var transactionRoot: String = js.native
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
  
  @scala.inline
  implicit class BlockHeaderOps[Self <: BlockHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtraData(value: String): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasLimit(value: Double): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: Double): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsBloom(value: String): Self = this.set("logsBloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiner(value: String): Self = this.set("miner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHash(value: String): Self = this.set("parentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptRoot(value: String): Self = this.set("receiptRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha3Uncles(value: String): Self = this.set("sha3Uncles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double | String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionRoot(value: String): Self = this.set("transactionRoot", value.asInstanceOf[js.Any])
  }
}

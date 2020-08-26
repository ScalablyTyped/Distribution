package typings.web3EthContract.mod

import org.scalablytyped.runtime.StringDictionary
import typings.web3EthContract.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var address: String = js.native
  var blockHash: String = js.native
  var blockNumber: Double = js.native
  var event: String = js.native
  var logIndex: Double = js.native
  var raw: Data = js.native
  var returnValues: StringDictionary[js.Any] = js.native
  var signature: String = js.native
  var transactionHash: String = js.native
  var transactionIndex: Double = js.native
}

object EventData {
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    event: String,
    logIndex: Double,
    raw: Data,
    returnValues: StringDictionary[js.Any],
    signature: String,
    transactionHash: String,
    transactionIndex: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockHash(value: String): Self = this.set("blockHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockNumber(value: Double): Self = this.set("blockNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogIndex(value: Double): Self = this.set("logIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: Data): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValues(value: StringDictionary[js.Any]): Self = this.set("returnValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionHash(value: String): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionIndex(value: Double): Self = this.set("transactionIndex", value.asInstanceOf[js.Any])
  }
  
}


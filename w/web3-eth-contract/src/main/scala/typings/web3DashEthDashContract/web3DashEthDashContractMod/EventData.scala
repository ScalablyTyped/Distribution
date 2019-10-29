package typings.web3DashEthDashContract.web3DashEthDashContractMod

import org.scalablytyped.runtime.StringDictionary
import typings.web3DashEthDashContract.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var address: String
  var blockHash: String
  var blockNumber: Double
  var event: String
  var logIndex: Double
  var raw: Anon_Data
  var returnValues: StringDictionary[js.Any]
  var signature: String
  var transactionHash: String
  var transactionIndex: Double
}

object EventData {
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    event: String,
    logIndex: Double,
    raw: Anon_Data,
    returnValues: StringDictionary[js.Any],
    signature: String,
    transactionHash: String,
    transactionIndex: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(address = address, blockHash = blockHash, blockNumber = blockNumber, event = event, logIndex = logIndex, raw = raw, returnValues = returnValues, signature = signature, transactionHash = transactionHash, transactionIndex = transactionIndex)
  
    __obj.asInstanceOf[EventData]
  }
}


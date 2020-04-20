package typings.web3EthContract.mod

import org.scalablytyped.runtime.StringDictionary
import typings.web3EthContract.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var address: String
  var blockHash: String
  var blockNumber: Double
  var event: String
  var logIndex: Double
  var raw: AnonData
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
    raw: AnonData,
    returnValues: StringDictionary[js.Any],
    signature: String,
    transactionHash: String,
    transactionIndex: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}


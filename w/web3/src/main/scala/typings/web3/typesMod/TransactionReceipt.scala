package typings.web3.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceipt extends js.Object {
  var blockHash: String
  var blockNumber: Double
  var contractAddress: String
  var cumulativeGasUsed: Double
  var events: js.UndefOr[StringDictionary[EventLog]] = js.undefined
  var from: String
  var gasUsed: Double
  var logs: js.UndefOr[js.Array[Log]] = js.undefined
  var status: Boolean
  var to: String
  var transactionHash: String
  var transactionIndex: Double
}

object TransactionReceipt {
  @scala.inline
  def apply(
    blockHash: String,
    blockNumber: Double,
    contractAddress: String,
    cumulativeGasUsed: Double,
    from: String,
    gasUsed: Double,
    status: Boolean,
    to: String,
    transactionHash: String,
    transactionIndex: Double,
    events: StringDictionary[EventLog] = null,
    logs: js.Array[Log] = null
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, contractAddress = contractAddress, cumulativeGasUsed = cumulativeGasUsed, from = from, gasUsed = gasUsed, status = status, to = to, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (events != null) __obj.updateDynamic("events")(events)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    __obj.asInstanceOf[TransactionReceipt]
  }
}


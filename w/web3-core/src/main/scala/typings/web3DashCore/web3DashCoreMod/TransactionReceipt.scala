package typings.web3DashCore.web3DashCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceipt extends js.Object {
  var blockHash: String
  var blockNumber: Double
  var contractAddress: js.UndefOr[String] = js.undefined
  var cumulativeGasUsed: Double
  var events: js.UndefOr[StringDictionary[EventLog]] = js.undefined
  var from: String
  var gasUsed: Double
  var logs: js.Array[Log]
  var logsBloom: String
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
    cumulativeGasUsed: Double,
    from: String,
    gasUsed: Double,
    logs: js.Array[Log],
    logsBloom: String,
    status: Boolean,
    to: String,
    transactionHash: String,
    transactionIndex: Double,
    contractAddress: String = null,
    events: StringDictionary[EventLog] = null
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, cumulativeGasUsed = cumulativeGasUsed, from = from, gasUsed = gasUsed, logs = logs, logsBloom = logsBloom, status = status, to = to, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (contractAddress != null) __obj.updateDynamic("contractAddress")(contractAddress)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[TransactionReceipt]
  }
}


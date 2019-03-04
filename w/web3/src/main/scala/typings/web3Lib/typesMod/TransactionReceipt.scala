package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionReceipt extends js.Object {
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var contractAddress: java.lang.String
  var cumulativeGasUsed: scala.Double
  var events: js.UndefOr[org.scalablytyped.runtime.StringDictionary[EventLog]] = js.undefined
  var from: java.lang.String
  var gasUsed: scala.Double
  var logs: js.UndefOr[js.Array[Log]] = js.undefined
  var status: scala.Boolean
  var to: java.lang.String
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

object TransactionReceipt {
  @scala.inline
  def apply(
    blockHash: java.lang.String,
    blockNumber: scala.Double,
    contractAddress: java.lang.String,
    cumulativeGasUsed: scala.Double,
    from: java.lang.String,
    gasUsed: scala.Double,
    status: scala.Boolean,
    to: java.lang.String,
    transactionHash: java.lang.String,
    transactionIndex: scala.Double,
    events: org.scalablytyped.runtime.StringDictionary[EventLog] = null,
    logs: js.Array[Log] = null
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash, blockNumber = blockNumber, contractAddress = contractAddress, cumulativeGasUsed = cumulativeGasUsed, from = from, gasUsed = gasUsed, status = status, to = to, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (events != null) __obj.updateDynamic("events")(events)
    if (logs != null) __obj.updateDynamic("logs")(logs)
    __obj.asInstanceOf[TransactionReceipt]
  }
}


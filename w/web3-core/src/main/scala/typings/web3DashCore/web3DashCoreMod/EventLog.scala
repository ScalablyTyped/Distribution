package typings.web3DashCore.web3DashCoreMod

import typings.web3DashCore.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLog extends js.Object {
  var address: String
  var blockHash: String
  var blockNumber: Double
  var event: String
  var logIndex: Double
  var raw: js.UndefOr[Anon_Data] = js.undefined
  var returnValues: js.Any
  var transactionHash: String
  var transactionIndex: Double
}

object EventLog {
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    event: String,
    logIndex: Double,
    returnValues: js.Any,
    transactionHash: String,
    transactionIndex: Double,
    raw: Anon_Data = null
  ): EventLog = {
    val __obj = js.Dynamic.literal(address = address, blockHash = blockHash, blockNumber = blockNumber, event = event, logIndex = logIndex, returnValues = returnValues, transactionHash = transactionHash, transactionIndex = transactionIndex)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[EventLog]
  }
}


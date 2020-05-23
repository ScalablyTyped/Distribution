package typings.web3Core.mod

import typings.web3Core.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventLog extends js.Object {
  var address: String
  var blockHash: String
  var blockNumber: Double
  var event: String
  var logIndex: Double
  var raw: js.UndefOr[Data] = js.undefined
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
    raw: Data = null
  ): EventLog = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], returnValues = returnValues.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLog]
  }
}


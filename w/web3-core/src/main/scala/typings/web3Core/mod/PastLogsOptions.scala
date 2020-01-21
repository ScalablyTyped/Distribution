package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PastLogsOptions extends LogsOptions {
  var toBlock: js.UndefOr[BlockNumber] = js.undefined
}

object PastLogsOptions {
  @scala.inline
  def apply(
    address: String | js.Array[String] = null,
    fromBlock: BlockNumber = null,
    toBlock: BlockNumber = null,
    topics: js.Array[String | js.Array[String] | Null] = null
  ): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PastLogsOptions]
  }
}


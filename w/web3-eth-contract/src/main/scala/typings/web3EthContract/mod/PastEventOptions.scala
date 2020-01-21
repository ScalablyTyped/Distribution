package typings.web3EthContract.mod

import typings.web3Core.mod.BlockNumber
import typings.web3Core.mod.PastLogsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PastEventOptions extends PastLogsOptions {
  var filter: js.UndefOr[Filter] = js.undefined
}

object PastEventOptions {
  @scala.inline
  def apply(
    address: String | js.Array[String] = null,
    filter: Filter = null,
    fromBlock: BlockNumber = null,
    toBlock: BlockNumber = null,
    topics: js.Array[String | js.Array[String] | Null] = null
  ): PastEventOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PastEventOptions]
  }
}


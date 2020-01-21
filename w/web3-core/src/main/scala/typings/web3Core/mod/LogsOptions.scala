package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsOptions extends js.Object {
  var address: js.UndefOr[String | js.Array[String]] = js.undefined
  var fromBlock: js.UndefOr[BlockNumber] = js.undefined
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.undefined
}

object LogsOptions {
  @scala.inline
  def apply(
    address: String | js.Array[String] = null,
    fromBlock: BlockNumber = null,
    topics: js.Array[String | js.Array[String] | Null] = null
  ): LogsOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsOptions]
  }
}


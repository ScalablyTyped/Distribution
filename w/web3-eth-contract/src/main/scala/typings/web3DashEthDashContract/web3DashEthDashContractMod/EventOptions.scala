package typings.web3DashEthDashContract.web3DashEthDashContractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var filter: js.UndefOr[js.Any] = js.undefined
  var fromBlock: js.UndefOr[Double] = js.undefined
  var toBlock: js.UndefOr[String | Double] = js.undefined
  var topics: js.UndefOr[js.Array[_]] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    filter: js.Any = null,
    fromBlock: Int | Double = null,
    toBlock: String | Double = null,
    topics: js.Array[_] = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[EventOptions]
  }
}


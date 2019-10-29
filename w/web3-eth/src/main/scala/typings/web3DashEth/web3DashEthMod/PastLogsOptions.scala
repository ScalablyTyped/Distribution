package typings.web3DashEth.web3DashEthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PastLogsOptions extends js.Object {
  var address: js.UndefOr[String | js.Array[String]] = js.undefined
  var fromBlock: js.UndefOr[Double | String] = js.undefined
  var toBlock: js.UndefOr[Double | String] = js.undefined
  var topics: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
}

object PastLogsOptions {
  @scala.inline
  def apply(
    address: String | js.Array[String] = null,
    fromBlock: Double | String = null,
    toBlock: Double | String = null,
    topics: js.Array[String | js.Array[String]] = null
  ): PastLogsOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[PastLogsOptions]
  }
}


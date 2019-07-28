package typings.web3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logs extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var fromBlock: js.UndefOr[Double] = js.undefined
  var topics: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
}

object Logs {
  @scala.inline
  def apply(
    address: String = null,
    fromBlock: Int | Double = null,
    topics: js.Array[String | js.Array[String]] = null
  ): Logs = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Logs]
  }
}


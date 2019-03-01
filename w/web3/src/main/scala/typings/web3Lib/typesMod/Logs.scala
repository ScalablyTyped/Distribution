package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logs extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var fromBlock: js.UndefOr[scala.Double] = js.undefined
  var topics: js.UndefOr[js.Array[java.lang.String | js.Array[java.lang.String]]] = js.undefined
}

object Logs {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    fromBlock: scala.Int | scala.Double = null,
    topics: js.Array[java.lang.String | js.Array[java.lang.String]] = null
  ): Logs = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Logs]
  }
}


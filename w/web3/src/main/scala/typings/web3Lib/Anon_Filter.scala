package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[js.Object] = js.undefined
  var fromBlock: js.UndefOr[web3Lib.ethTypesMod.BlockType] = js.undefined
  var topics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: js.Object = null,
    fromBlock: web3Lib.ethTypesMod.BlockType = null,
    topics: js.Array[java.lang.String] = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_Filter]
  }
}


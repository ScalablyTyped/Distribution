package typings.web3

import typings.web3.ethTypesMod.BlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterFromBlock extends js.Object {
  var filter: js.UndefOr[js.Object] = js.undefined
  var fromBlock: js.UndefOr[BlockType] = js.undefined
  var toBlock: js.UndefOr[BlockType] = js.undefined
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_FilterFromBlock {
  @scala.inline
  def apply(
    filter: js.Object = null,
    fromBlock: BlockType = null,
    toBlock: BlockType = null,
    topics: js.Array[String] = null
  ): Anon_FilterFromBlock = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_FilterFromBlock]
  }
}


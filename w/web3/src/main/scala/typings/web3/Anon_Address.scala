package typings.web3

import typings.web3.ethTypesMod.BlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var fromBlock: js.UndefOr[BlockType] = js.undefined
  var toBlock: js.UndefOr[BlockType] = js.undefined
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: String = null,
    fromBlock: BlockType = null,
    toBlock: BlockType = null,
    topics: js.Array[String | js.Array[String] | Null] = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_Address]
  }
}


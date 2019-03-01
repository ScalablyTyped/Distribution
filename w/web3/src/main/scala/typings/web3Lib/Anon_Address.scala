package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var fromBlock: js.UndefOr[web3Lib.ethTypesMod.BlockType] = js.undefined
  var toBlock: js.UndefOr[web3Lib.ethTypesMod.BlockType] = js.undefined
  var topics: js.UndefOr[js.Array[java.lang.String | js.Array[java.lang.String] | scala.Null]] = js.undefined
}

object Anon_Address {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    fromBlock: web3Lib.ethTypesMod.BlockType = null,
    toBlock: web3Lib.ethTypesMod.BlockType = null,
    topics: js.Array[java.lang.String | js.Array[java.lang.String] | scala.Null] = null
  ): Anon_Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (fromBlock != null) __obj.updateDynamic("fromBlock")(fromBlock.asInstanceOf[js.Any])
    if (toBlock != null) __obj.updateDynamic("toBlock")(toBlock.asInstanceOf[js.Any])
    if (topics != null) __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[Anon_Address]
  }
}


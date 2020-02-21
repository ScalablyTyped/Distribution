package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbiInput extends js.Object {
  var components: js.UndefOr[js.Array[AbiInput]] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var internalType: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: String
}

object AbiInput {
  @scala.inline
  def apply(
    name: String,
    `type`: String,
    components: js.Array[AbiInput] = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    internalType: String = null
  ): AbiInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    if (internalType != null) __obj.updateDynamic("internalType")(internalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbiInput]
  }
}


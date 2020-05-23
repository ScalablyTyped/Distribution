package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbiItem extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var constant: js.UndefOr[Boolean] = js.undefined
  var gas: js.UndefOr[Double] = js.undefined
  var inputs: js.UndefOr[js.Array[AbiInput]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outputs: js.UndefOr[js.Array[AbiOutput]] = js.undefined
  var payable: js.UndefOr[Boolean] = js.undefined
  var stateMutability: js.UndefOr[StateMutabilityType] = js.undefined
  var `type`: AbiType
}

object AbiItem {
  @scala.inline
  def apply(
    `type`: AbiType,
    anonymous: js.UndefOr[Boolean] = js.undefined,
    constant: js.UndefOr[Boolean] = js.undefined,
    gas: js.UndefOr[Double] = js.undefined,
    inputs: js.Array[AbiInput] = null,
    name: String = null,
    outputs: js.Array[AbiOutput] = null,
    payable: js.UndefOr[Boolean] = js.undefined,
    stateMutability: StateMutabilityType = null
  ): AbiItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constant)) __obj.updateDynamic("constant")(constant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gas)) __obj.updateDynamic("gas")(gas.get.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(payable)) __obj.updateDynamic("payable")(payable.get.asInstanceOf[js.Any])
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbiItem]
  }
}


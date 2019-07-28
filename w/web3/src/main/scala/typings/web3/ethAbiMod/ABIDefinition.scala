package typings.web3.ethAbiMod

import typings.web3.Anon_Indexed
import typings.web3.Anon_Name
import typings.web3.web3Strings.constructor
import typings.web3.web3Strings.event
import typings.web3.web3Strings.fallback
import typings.web3.web3Strings.function
import typings.web3.web3Strings.nonpayable
import typings.web3.web3Strings.payable
import typings.web3.web3Strings.pure
import typings.web3.web3Strings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ABIDefinition extends js.Object {
  var anonymous: js.UndefOr[Boolean] = js.undefined
  var constant: js.UndefOr[Boolean] = js.undefined
  var inputs: js.UndefOr[js.Array[Anon_Indexed]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outputs: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var payable: js.UndefOr[Boolean] = js.undefined
  var stateMutability: js.UndefOr[pure | view | nonpayable | payable] = js.undefined
  var `type`: function | constructor | event | fallback
}

object ABIDefinition {
  @scala.inline
  def apply(
    `type`: function | constructor | event | fallback,
    anonymous: js.UndefOr[Boolean] = js.undefined,
    constant: js.UndefOr[Boolean] = js.undefined,
    inputs: js.Array[Anon_Indexed] = null,
    name: String = null,
    outputs: js.Array[Anon_Name] = null,
    payable: js.UndefOr[Boolean] = js.undefined,
    stateMutability: pure | view | nonpayable | payable = null
  ): ABIDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (!js.isUndefined(constant)) __obj.updateDynamic("constant")(constant)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputs != null) __obj.updateDynamic("outputs")(outputs)
    if (!js.isUndefined(payable)) __obj.updateDynamic("payable")(payable)
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABIDefinition]
  }
}


package typings
package web3Lib.ethAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ABIDefinition extends js.Object {
  var anonymous: js.UndefOr[scala.Boolean] = js.undefined
  var constant: js.UndefOr[scala.Boolean] = js.undefined
  var inputs: js.UndefOr[js.Array[web3Lib.Anon_Indexed]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var outputs: js.UndefOr[js.Array[web3Lib.Anon_Name]] = js.undefined
  var payable: js.UndefOr[scala.Boolean] = js.undefined
  var stateMutability: js.UndefOr[
    web3Lib.web3LibStrings.pure | web3Lib.web3LibStrings.view | web3Lib.web3LibStrings.nonpayable | web3Lib.web3LibStrings.payable
  ] = js.undefined
  var `type`: web3Lib.web3LibStrings.function | web3Lib.web3LibStrings.constructor | web3Lib.web3LibStrings.event | web3Lib.web3LibStrings.fallback
}

object ABIDefinition {
  @scala.inline
  def apply(
    `type`: web3Lib.web3LibStrings.function | web3Lib.web3LibStrings.constructor | web3Lib.web3LibStrings.event | web3Lib.web3LibStrings.fallback,
    anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    constant: js.UndefOr[scala.Boolean] = js.undefined,
    inputs: js.Array[web3Lib.Anon_Indexed] = null,
    name: java.lang.String = null,
    outputs: js.Array[web3Lib.Anon_Name] = null,
    payable: js.UndefOr[scala.Boolean] = js.undefined,
    stateMutability: web3Lib.web3LibStrings.pure | web3Lib.web3LibStrings.view | web3Lib.web3LibStrings.nonpayable | web3Lib.web3LibStrings.payable = null
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


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


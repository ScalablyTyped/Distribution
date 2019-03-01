package typings
package web3Lib.ethContractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomOptions extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var gas: js.UndefOr[scala.Double] = js.undefined
  var gasPrice: js.UndefOr[java.lang.String] = js.undefined
  var jsonInterface: js.UndefOr[js.Array[web3Lib.ethAbiMod.ABIDefinition]] = js.undefined
}

object CustomOptions {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    data: java.lang.String = null,
    from: java.lang.String = null,
    gas: scala.Int | scala.Double = null,
    gasPrice: java.lang.String = null,
    jsonInterface: js.Array[web3Lib.ethAbiMod.ABIDefinition] = null
  ): CustomOptions = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (data != null) __obj.updateDynamic("data")(data)
    if (from != null) __obj.updateDynamic("from")(from)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice)
    if (jsonInterface != null) __obj.updateDynamic("jsonInterface")(jsonInterface)
    __obj.asInstanceOf[CustomOptions]
  }
}


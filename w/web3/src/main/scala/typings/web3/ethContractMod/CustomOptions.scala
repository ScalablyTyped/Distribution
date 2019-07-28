package typings.web3.ethContractMod

import typings.web3.ethAbiMod.ABIDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomOptions extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var gas: js.UndefOr[Double] = js.undefined
  var gasPrice: js.UndefOr[String] = js.undefined
  var jsonInterface: js.UndefOr[js.Array[ABIDefinition]] = js.undefined
}

object CustomOptions {
  @scala.inline
  def apply(
    address: String = null,
    data: String = null,
    from: String = null,
    gas: Int | Double = null,
    gasPrice: String = null,
    jsonInterface: js.Array[ABIDefinition] = null
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


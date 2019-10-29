package typings.web3DashEthDashContract.web3DashEthDashContractMod

import typings.web3DashUtils.web3DashUtilsMod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ContractOptions {
  var address: String
  var jsonInterface: js.Array[AbiItem]
}

object Options {
  @scala.inline
  def apply(
    address: String,
    jsonInterface: js.Array[AbiItem],
    data: String = null,
    from: String = null,
    gas: Int | Double = null,
    gasPrice: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(address = address, jsonInterface = jsonInterface)
    if (data != null) __obj.updateDynamic("data")(data)
    if (from != null) __obj.updateDynamic("from")(from)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice)
    __obj.asInstanceOf[Options]
  }
}


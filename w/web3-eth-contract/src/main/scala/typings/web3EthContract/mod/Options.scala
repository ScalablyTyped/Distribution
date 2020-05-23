package typings.web3EthContract.mod

import typings.web3Utils.mod.AbiItem
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
    gas: js.UndefOr[Double] = js.undefined,
    gasPrice: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], jsonInterface = jsonInterface.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(gas)) __obj.updateDynamic("gas")(gas.get.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


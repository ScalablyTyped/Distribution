package typings.web3EthContract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContractOptions extends js.Object {
  // Contract code
  var data: js.UndefOr[String] = js.undefined
  // Sender to use for contract calls
  var from: js.UndefOr[String] = js.undefined
  // Gas to use for contract calls
  var gas: js.UndefOr[Double] = js.undefined
  // Gas price to use for contract calls
  var gasPrice: js.UndefOr[String] = js.undefined
}

object ContractOptions {
  @scala.inline
  def apply(data: String = null, from: String = null, gas: Int | Double = null, gasPrice: String = null): ContractOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractOptions]
  }
}


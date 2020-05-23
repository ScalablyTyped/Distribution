package typings.web3EthContract.mod

import typings.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EstimateGasOptions extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var gas: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double | String | ^ ] = js.undefined
}

object EstimateGasOptions {
  @scala.inline
  def apply(from: String = null, gas: js.UndefOr[Double] = js.undefined, value: Double | String | ^  = null): EstimateGasOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(gas)) __obj.updateDynamic("gas")(gas.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimateGasOptions]
  }
}


package typings.web3DashEthDashContract.web3DashEthDashContractMod

import typings.bnDotJs.bnDotJsMod.^
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
  def apply(from: String = null, gas: Int | Double = null, value: Double | String | ^  = null): EstimateGasOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimateGasOptions]
  }
}


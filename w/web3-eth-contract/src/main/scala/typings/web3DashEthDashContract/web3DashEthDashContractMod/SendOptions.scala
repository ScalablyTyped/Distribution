package typings.web3DashEthDashContract.web3DashEthDashContractMod

import typings.bnDotJs.bnDotJsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  var from: String
  var gas: js.UndefOr[Double] = js.undefined
  var gasPrice: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String | ^ ] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    from: String,
    gas: Int | Double = null,
    gasPrice: String = null,
    value: Double | String | ^  = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}


package typings.web3EthContract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var gas: js.UndefOr[Double] = js.undefined
  var gasPrice: js.UndefOr[String] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(from: String = null, gas: js.UndefOr[Double] = js.undefined, gasPrice: String = null): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(gas)) __obj.updateDynamic("gas")(gas.get.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}


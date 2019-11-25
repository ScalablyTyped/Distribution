package typings.web3DashCore.web3DashCoreMod

import typings.bnDotJs.bnDotJsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionConfig extends js.Object {
  var chain: js.UndefOr[String] = js.undefined
  var chainId: js.UndefOr[Double] = js.undefined
  var common: js.UndefOr[Common] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String | Double] = js.undefined
  var gas: js.UndefOr[Double | String] = js.undefined
  var gasPrice: js.UndefOr[Double | String | ^ ] = js.undefined
  var hardfork: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double | String | ^ ] = js.undefined
}

object TransactionConfig {
  @scala.inline
  def apply(
    chain: String = null,
    chainId: Int | Double = null,
    common: Common = null,
    data: String = null,
    from: String | Double = null,
    gas: Double | String = null,
    gasPrice: Double | String | ^  = null,
    hardfork: String = null,
    nonce: Int | Double = null,
    to: String = null,
    value: Double | String | ^  = null
  ): TransactionConfig = {
    val __obj = js.Dynamic.literal()
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gas != null) __obj.updateDynamic("gas")(gas.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (hardfork != null) __obj.updateDynamic("hardfork")(hardfork.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionConfig]
  }
}


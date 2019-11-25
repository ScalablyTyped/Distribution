package typings.web3DashCore.web3DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Common extends js.Object {
  var baseChain: js.UndefOr[chain] = js.undefined
  var customChain: CustomChainParams
  var hardfork: js.UndefOr[typings.web3DashCore.web3DashCoreMod.hardfork] = js.undefined
}

object Common {
  @scala.inline
  def apply(customChain: CustomChainParams, baseChain: chain = null, hardfork: hardfork = null): Common = {
    val __obj = js.Dynamic.literal(customChain = customChain.asInstanceOf[js.Any])
    if (baseChain != null) __obj.updateDynamic("baseChain")(baseChain.asInstanceOf[js.Any])
    if (hardfork != null) __obj.updateDynamic("hardfork")(hardfork.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
}


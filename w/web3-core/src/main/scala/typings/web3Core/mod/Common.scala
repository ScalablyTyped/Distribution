package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Common extends js.Object {
  var baseChain: js.UndefOr[chain] = js.native
  var customChain: CustomChainParams = js.native
  var hardfork: js.UndefOr[typings.web3Core.mod.hardfork] = js.native
}

object Common {
  @scala.inline
  def apply(customChain: CustomChainParams): Common = {
    val __obj = js.Dynamic.literal(customChain = customChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  @scala.inline
  implicit class CommonOps[Self <: Common] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomChain(value: CustomChainParams): Self = this.set("customChain", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseChain(value: chain): Self = this.set("baseChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseChain: Self = this.set("baseChain", js.undefined)
    @scala.inline
    def setHardfork(value: hardfork): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
  }
  
}


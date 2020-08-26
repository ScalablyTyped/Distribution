package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomChainParams extends js.Object {
  var chainId: Double = js.native
  var name: js.UndefOr[String] = js.native
  var networkId: Double = js.native
}

object CustomChainParams {
  @scala.inline
  def apply(chainId: Double, networkId: Double): CustomChainParams = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChainParams]
  }
  @scala.inline
  implicit class CustomChainParamsOps[Self <: CustomChainParams] (val x: Self) extends AnyVal {
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
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: Double): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


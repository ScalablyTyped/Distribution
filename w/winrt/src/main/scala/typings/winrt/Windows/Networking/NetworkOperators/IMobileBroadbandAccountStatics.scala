package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandAccountStatics extends js.Object {
  
  var availableNetworkAccountIds: IVectorView[String] = js.native
  
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount = js.native
}
object IMobileBroadbandAccountStatics {
  
  @scala.inline
  def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => MobileBroadbandAccount
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any], createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
  
  @scala.inline
  implicit class IMobileBroadbandAccountStaticsOps[Self <: IMobileBroadbandAccountStatics] (val x: Self) extends AnyVal {
    
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
    def setAvailableNetworkAccountIds(value: IVectorView[String]): Self = this.set("availableNetworkAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromNetworkAccountId(value: String => MobileBroadbandAccount): Self = this.set("createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
}

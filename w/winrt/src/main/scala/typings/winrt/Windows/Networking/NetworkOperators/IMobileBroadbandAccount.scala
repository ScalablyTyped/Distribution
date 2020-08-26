package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMobileBroadbandAccount extends js.Object {
  var currentDeviceInformation: MobileBroadbandDeviceInformation = js.native
  var currentNetwork: MobileBroadbandNetwork = js.native
  var networkAccountId: String = js.native
  var serviceProviderGuid: String = js.native
  var serviceProviderName: String = js.native
}

object IMobileBroadbandAccount {
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): IMobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccount]
  }
  @scala.inline
  implicit class IMobileBroadbandAccountOps[Self <: IMobileBroadbandAccount] (val x: Self) extends AnyVal {
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
    def setCurrentDeviceInformation(value: MobileBroadbandDeviceInformation): Self = this.set("currentDeviceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNetwork(value: MobileBroadbandNetwork): Self = this.set("currentNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceProviderGuid(value: String): Self = this.set("serviceProviderGuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceProviderName(value: String): Self = this.set("serviceProviderName", value.asInstanceOf[js.Any])
  }
  
}


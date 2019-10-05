package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccount extends js.Object {
  var currentDeviceInformation: MobileBroadbandDeviceInformation
  var currentNetwork: MobileBroadbandNetwork
  var networkAccountId: String
  var serviceProviderGuid: String
  var serviceProviderName: String
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
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation, currentNetwork = currentNetwork, networkAccountId = networkAccountId, serviceProviderGuid = serviceProviderGuid, serviceProviderName = serviceProviderName)
  
    __obj.asInstanceOf[IMobileBroadbandAccount]
  }
}


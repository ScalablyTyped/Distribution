package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMobileBroadbandAccount extends js.Object {
  var currentDeviceInformation: MobileBroadbandDeviceInformation
  var currentNetwork: MobileBroadbandNetwork
  var networkAccountId: java.lang.String
  var serviceProviderGuid: java.lang.String
  var serviceProviderName: java.lang.String
}

object IMobileBroadbandAccount {
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    networkAccountId: java.lang.String,
    serviceProviderGuid: java.lang.String,
    serviceProviderName: java.lang.String
  ): IMobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation, currentNetwork = currentNetwork, networkAccountId = networkAccountId, serviceProviderGuid = serviceProviderGuid, serviceProviderName = serviceProviderName)
  
    __obj.asInstanceOf[IMobileBroadbandAccount]
  }
}


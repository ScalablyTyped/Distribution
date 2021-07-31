package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileBroadbandAccount
  extends StObject
     with IMobileBroadbandAccount
object MobileBroadbandAccount {
  
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): MobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccount]
  }
}

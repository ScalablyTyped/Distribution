package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccount extends StObject {
  
  var currentDeviceInformation: MobileBroadbandDeviceInformation
  
  var currentNetwork: MobileBroadbandNetwork
  
  var networkAccountId: String
  
  var serviceProviderGuid: String
  
  var serviceProviderName: String
}
object IMobileBroadbandAccount {
  
  inline def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): IMobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMobileBroadbandAccount]
  }
  
  extension [Self <: IMobileBroadbandAccount](x: Self) {
    
    inline def setCurrentDeviceInformation(value: MobileBroadbandDeviceInformation): Self = StObject.set(x, "currentDeviceInformation", value.asInstanceOf[js.Any])
    
    inline def setCurrentNetwork(value: MobileBroadbandNetwork): Self = StObject.set(x, "currentNetwork", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccountId(value: String): Self = StObject.set(x, "networkAccountId", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderGuid(value: String): Self = StObject.set(x, "serviceProviderGuid", value.asInstanceOf[js.Any])
    
    inline def setServiceProviderName(value: String): Self = StObject.set(x, "serviceProviderName", value.asInstanceOf[js.Any])
  }
}

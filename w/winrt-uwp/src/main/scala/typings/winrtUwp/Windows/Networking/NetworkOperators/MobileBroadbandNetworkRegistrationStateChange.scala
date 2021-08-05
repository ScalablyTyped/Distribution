package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about one network registration state change. */
trait MobileBroadbandNetworkRegistrationStateChange extends StObject {
  
  /** Gets the unique identifier of the device associated with a network registration state change. */
  var deviceId: String
  
  /** Gets an object which contains details about the network associated with this network state change. */
  var network: MobileBroadbandNetwork
}
object MobileBroadbandNetworkRegistrationStateChange {
  
  inline def apply(deviceId: String, network: MobileBroadbandNetwork): MobileBroadbandNetworkRegistrationStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChange]
  }
  
  extension [Self <: MobileBroadbandNetworkRegistrationStateChange](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setNetwork(value: MobileBroadbandNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
  }
}

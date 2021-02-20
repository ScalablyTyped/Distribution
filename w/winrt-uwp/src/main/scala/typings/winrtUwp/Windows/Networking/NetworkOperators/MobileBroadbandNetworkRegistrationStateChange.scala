package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about one network registration state change. */
@js.native
trait MobileBroadbandNetworkRegistrationStateChange extends StObject {
  
  /** Gets the unique identifier of the device associated with a network registration state change. */
  var deviceId: String = js.native
  
  /** Gets an object which contains details about the network associated with this network state change. */
  var network: MobileBroadbandNetwork = js.native
}
object MobileBroadbandNetworkRegistrationStateChange {
  
  @scala.inline
  def apply(deviceId: String, network: MobileBroadbandNetwork): MobileBroadbandNetworkRegistrationStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChange]
  }
  
  @scala.inline
  implicit class MobileBroadbandNetworkRegistrationStateChangeMutableBuilder[Self <: MobileBroadbandNetworkRegistrationStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: MobileBroadbandNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
  }
}

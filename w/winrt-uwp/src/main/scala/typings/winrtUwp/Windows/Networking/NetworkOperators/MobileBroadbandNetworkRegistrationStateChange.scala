package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about one network registration state change. */
@js.native
trait MobileBroadbandNetworkRegistrationStateChange extends js.Object {
  
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
  implicit class MobileBroadbandNetworkRegistrationStateChangeOps[Self <: MobileBroadbandNetworkRegistrationStateChange] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetwork(value: MobileBroadbandNetwork): Self = this.set("network", value.asInstanceOf[js.Any])
  }
}

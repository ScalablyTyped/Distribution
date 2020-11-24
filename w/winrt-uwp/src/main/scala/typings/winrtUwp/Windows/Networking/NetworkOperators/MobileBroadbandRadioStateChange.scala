package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a radio state change notification. */
@js.native
trait MobileBroadbandRadioStateChange extends js.Object {
  
  /** Gets the device ID of the device whose radio state changed. */
  var deviceId: String = js.native
  
  /** Gets the new state of the radio. */
  var radioState: MobileBroadbandRadioState = js.native
}
object MobileBroadbandRadioStateChange {
  
  @scala.inline
  def apply(deviceId: String, radioState: MobileBroadbandRadioState): MobileBroadbandRadioStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], radioState = radioState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChange]
  }
  
  @scala.inline
  implicit class MobileBroadbandRadioStateChangeOps[Self <: MobileBroadbandRadioStateChange] (val x: Self) extends AnyVal {
    
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
    def setRadioState(value: MobileBroadbandRadioState): Self = this.set("radioState", value.asInstanceOf[js.Any])
  }
}

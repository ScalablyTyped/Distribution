package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details of a radio state change notification. */
@js.native
trait MobileBroadbandRadioStateChange extends StObject {
  
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
  implicit class MobileBroadbandRadioStateChangeMutableBuilder[Self <: MobileBroadbandRadioStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioState(value: MobileBroadbandRadioState): Self = StObject.set(x, "radioState", value.asInstanceOf[js.Any])
  }
}

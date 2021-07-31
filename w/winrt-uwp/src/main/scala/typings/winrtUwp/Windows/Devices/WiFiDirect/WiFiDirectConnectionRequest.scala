package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
trait WiFiDirectConnectionRequest extends StObject {
  
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): Unit
  
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: DeviceInformation
}
object WiFiDirectConnectionRequest {
  
  @scala.inline
  def apply(close: () => Unit, deviceInformation: DeviceInformation): WiFiDirectConnectionRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceInformation = deviceInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectConnectionRequest]
  }
  
  @scala.inline
  implicit class WiFiDirectConnectionRequestMutableBuilder[Self <: WiFiDirectConnectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
  }
}

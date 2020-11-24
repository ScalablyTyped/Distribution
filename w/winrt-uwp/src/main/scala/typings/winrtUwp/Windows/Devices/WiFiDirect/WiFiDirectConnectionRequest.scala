package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
@js.native
trait WiFiDirectConnectionRequest extends js.Object {
  
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): Unit = js.native
  
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: DeviceInformation = js.native
}
object WiFiDirectConnectionRequest {
  
  @scala.inline
  def apply(close: () => Unit, deviceInformation: DeviceInformation): WiFiDirectConnectionRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceInformation = deviceInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectConnectionRequest]
  }
  
  @scala.inline
  implicit class WiFiDirectConnectionRequestOps[Self <: WiFiDirectConnectionRequest] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeviceInformation(value: DeviceInformation): Self = this.set("deviceInformation", value.asInstanceOf[js.Any])
  }
}

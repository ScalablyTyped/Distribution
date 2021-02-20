package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a Wi-Fi Direct Service session request. */
@js.native
trait WiFiDirectServiceSessionRequest extends StObject {
  
  /** Closes the session request. Your server code calls this method to reject a session request. */
  def close(): Unit = js.native
  
  /** Gets device information for the requesting device. */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets information about how provisioning should be performed if the session is established. */
  var provisioningInfo: WiFiDirectServiceProvisioningInfo = js.native
  
  /** Gets the session information blob associated with this request. */
  var sessionInfo: IBuffer = js.native
}
object WiFiDirectServiceSessionRequest {
  
  @scala.inline
  def apply(
    close: () => Unit,
    deviceInformation: DeviceInformation,
    provisioningInfo: WiFiDirectServiceProvisioningInfo,
    sessionInfo: IBuffer
  ): WiFiDirectServiceSessionRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceInformation = deviceInformation.asInstanceOf[js.Any], provisioningInfo = provisioningInfo.asInstanceOf[js.Any], sessionInfo = sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceSessionRequest]
  }
  
  @scala.inline
  implicit class WiFiDirectServiceSessionRequestMutableBuilder[Self <: WiFiDirectServiceSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningInfo(value: WiFiDirectServiceProvisioningInfo): Self = StObject.set(x, "provisioningInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfo(value: IBuffer): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
  }
}

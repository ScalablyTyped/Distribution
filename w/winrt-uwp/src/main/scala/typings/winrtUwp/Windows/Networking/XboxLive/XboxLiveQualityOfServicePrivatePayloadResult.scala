package typings.winrtUwp.Windows.Networking.XboxLive

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServicePrivatePayloadResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveQualityOfServiceMeasurementStatus = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IBuffer = js.native
}
object XboxLiveQualityOfServicePrivatePayloadResult {
  
  @scala.inline
  def apply(
    deviceAddress: XboxLiveDeviceAddress,
    status: XboxLiveQualityOfServiceMeasurementStatus,
    value: IBuffer
  ): XboxLiveQualityOfServicePrivatePayloadResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServicePrivatePayloadResult]
  }
  
  @scala.inline
  implicit class XboxLiveQualityOfServicePrivatePayloadResultMutableBuilder[Self <: XboxLiveQualityOfServicePrivatePayloadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceAddress(value: XboxLiveDeviceAddress): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: XboxLiveQualityOfServiceMeasurementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.winrtUwp.Windows.Networking.XboxLive

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveQualityOfServicePrivatePayloadResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveQualityOfServiceMeasurementStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IBuffer
}
object XboxLiveQualityOfServicePrivatePayloadResult {
  
  inline def apply(
    deviceAddress: XboxLiveDeviceAddress,
    status: XboxLiveQualityOfServiceMeasurementStatus,
    value: IBuffer
  ): XboxLiveQualityOfServicePrivatePayloadResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServicePrivatePayloadResult]
  }
  
  extension [Self <: XboxLiveQualityOfServicePrivatePayloadResult](x: Self) {
    
    inline def setDeviceAddress(value: XboxLiveDeviceAddress): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: XboxLiveQualityOfServiceMeasurementStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: IBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

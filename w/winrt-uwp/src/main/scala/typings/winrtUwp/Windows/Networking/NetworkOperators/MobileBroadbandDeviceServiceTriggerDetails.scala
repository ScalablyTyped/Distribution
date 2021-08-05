package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network device service notification. */
trait MobileBroadbandDeviceServiceTriggerDetails extends StObject {
  
  /** Gets the device ID of the device that triggered a broadband device service event. */
  var deviceId: String
  
  /** Gets the device service identifier for the device service trigger event. */
  var deviceServiceId: String
  
  /** Gets the received data associated with the triggered event. */
  var receivedData: IBuffer
}
object MobileBroadbandDeviceServiceTriggerDetails {
  
  inline def apply(deviceId: String, deviceServiceId: String, receivedData: IBuffer): MobileBroadbandDeviceServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceServiceId = deviceServiceId.asInstanceOf[js.Any], receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceTriggerDetails]
  }
  
  extension [Self <: MobileBroadbandDeviceServiceTriggerDetails](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceServiceId(value: String): Self = StObject.set(x, "deviceServiceId", value.asInstanceOf[js.Any])
    
    inline def setReceivedData(value: IBuffer): Self = StObject.set(x, "receivedData", value.asInstanceOf[js.Any])
  }
}

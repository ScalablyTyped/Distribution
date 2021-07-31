package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a mobile broadband device service. */
trait MobileBroadbandDeviceServiceInformation extends StObject {
  
  /** Gets the unique device service identifier for the mobile broadband device. */
  var deviceServiceId: String
  
  /** Determines if the mobile broadband device service is able to read data. */
  var isDataReadSupported: Boolean
  
  /** Determines if the mobile broadband device service is able to write data. */
  var isDataWriteSupported: Boolean
}
object MobileBroadbandDeviceServiceInformation {
  
  @scala.inline
  def apply(deviceServiceId: String, isDataReadSupported: Boolean, isDataWriteSupported: Boolean): MobileBroadbandDeviceServiceInformation = {
    val __obj = js.Dynamic.literal(deviceServiceId = deviceServiceId.asInstanceOf[js.Any], isDataReadSupported = isDataReadSupported.asInstanceOf[js.Any], isDataWriteSupported = isDataWriteSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceInformation]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceInformationMutableBuilder[Self <: MobileBroadbandDeviceServiceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceServiceId(value: String): Self = StObject.set(x, "deviceServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataReadSupported(value: Boolean): Self = StObject.set(x, "isDataReadSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataWriteSupported(value: Boolean): Self = StObject.set(x, "isDataWriteSupported", value.asInstanceOf[js.Any])
  }
}

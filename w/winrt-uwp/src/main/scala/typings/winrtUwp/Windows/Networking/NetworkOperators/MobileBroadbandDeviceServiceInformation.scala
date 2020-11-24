package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a mobile broadband device service. */
@js.native
trait MobileBroadbandDeviceServiceInformation extends js.Object {
  
  /** Gets the unique device service identifier for the mobile broadband device. */
  var deviceServiceId: String = js.native
  
  /** Determines if the mobile broadband device service is able to read data. */
  var isDataReadSupported: Boolean = js.native
  
  /** Determines if the mobile broadband device service is able to write data. */
  var isDataWriteSupported: Boolean = js.native
}
object MobileBroadbandDeviceServiceInformation {
  
  @scala.inline
  def apply(deviceServiceId: String, isDataReadSupported: Boolean, isDataWriteSupported: Boolean): MobileBroadbandDeviceServiceInformation = {
    val __obj = js.Dynamic.literal(deviceServiceId = deviceServiceId.asInstanceOf[js.Any], isDataReadSupported = isDataReadSupported.asInstanceOf[js.Any], isDataWriteSupported = isDataWriteSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceInformation]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceInformationOps[Self <: MobileBroadbandDeviceServiceInformation] (val x: Self) extends AnyVal {
    
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
    def setDeviceServiceId(value: String): Self = this.set("deviceServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataReadSupported(value: Boolean): Self = this.set("isDataReadSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataWriteSupported(value: Boolean): Self = this.set("isDataWriteSupported", value.asInstanceOf[js.Any])
  }
}

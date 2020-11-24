package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network device service notification. */
@js.native
trait MobileBroadbandDeviceServiceTriggerDetails extends js.Object {
  
  /** Gets the device ID of the device that triggered a broadband device service event. */
  var deviceId: String = js.native
  
  /** Gets the device service identifier for the device service trigger event. */
  var deviceServiceId: String = js.native
  
  /** Gets the received data associated with the triggered event. */
  var receivedData: IBuffer = js.native
}
object MobileBroadbandDeviceServiceTriggerDetails {
  
  @scala.inline
  def apply(deviceId: String, deviceServiceId: String, receivedData: IBuffer): MobileBroadbandDeviceServiceTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceServiceId = deviceServiceId.asInstanceOf[js.Any], receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceTriggerDetails]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceTriggerDetailsOps[Self <: MobileBroadbandDeviceServiceTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setDeviceServiceId(value: String): Self = this.set("deviceServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedData(value: IBuffer): Self = this.set("receivedData", value.asInstanceOf[js.Any])
  }
}

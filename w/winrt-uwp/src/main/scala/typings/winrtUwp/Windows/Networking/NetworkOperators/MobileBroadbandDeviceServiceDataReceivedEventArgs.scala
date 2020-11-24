package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
@js.native
trait MobileBroadbandDeviceServiceDataReceivedEventArgs extends js.Object {
  
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  var receivedData: IBuffer = js.native
}
object MobileBroadbandDeviceServiceDataReceivedEventArgs {
  
  @scala.inline
  def apply(receivedData: IBuffer): MobileBroadbandDeviceServiceDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(receivedData = receivedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandDeviceServiceDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MobileBroadbandDeviceServiceDataReceivedEventArgsOps[Self <: MobileBroadbandDeviceServiceDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReceivedData(value: IBuffer): Self = this.set("receivedData", value.asInstanceOf[js.Any])
  }
}

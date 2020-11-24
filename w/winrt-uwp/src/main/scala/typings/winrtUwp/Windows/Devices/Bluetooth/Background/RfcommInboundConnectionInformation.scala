package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities
import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
@js.native
trait RfcommInboundConnectionInformation extends js.Object {
  
  /** Gets or sets the service UUID that will be advertised in the SDP record. */
  var localServiceId: RfcommServiceId = js.native
  
  /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
  var sdpRecord: IBuffer = js.native
  
  /** Gets or sets the service capabilities that will be advertised. */
  var serviceCapabilities: BluetoothServiceCapabilities = js.native
}
object RfcommInboundConnectionInformation {
  
  @scala.inline
  def apply(
    localServiceId: RfcommServiceId,
    sdpRecord: IBuffer,
    serviceCapabilities: BluetoothServiceCapabilities
  ): RfcommInboundConnectionInformation = {
    val __obj = js.Dynamic.literal(localServiceId = localServiceId.asInstanceOf[js.Any], sdpRecord = sdpRecord.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommInboundConnectionInformation]
  }
  
  @scala.inline
  implicit class RfcommInboundConnectionInformationOps[Self <: RfcommInboundConnectionInformation] (val x: Self) extends AnyVal {
    
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
    def setLocalServiceId(value: RfcommServiceId): Self = this.set("localServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpRecord(value: IBuffer): Self = this.set("sdpRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCapabilities(value: BluetoothServiceCapabilities): Self = this.set("serviceCapabilities", value.asInstanceOf[js.Any])
  }
}

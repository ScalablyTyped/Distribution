package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities
import typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
trait RfcommInboundConnectionInformation extends js.Object {
  /** Gets or sets the service UUID that will be advertised in the SDP record. */
  var localServiceId: RfcommServiceId
  /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
  var sdpRecord: IBuffer
  /** Gets or sets the service capabilities that will be advertised. */
  var serviceCapabilities: BluetoothServiceCapabilities
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
}


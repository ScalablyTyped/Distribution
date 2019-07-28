package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities
import typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.RfcommNs.RfcommServiceId
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation")
@js.native
abstract class RfcommInboundConnectionInformation () extends js.Object {
  /** Gets or sets the service UUID that will be advertised in the SDP record. */
  var localServiceId: RfcommServiceId = js.native
  /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
  var sdpRecord: IBuffer = js.native
  /** Gets or sets the service capabilities that will be advertised. */
  var serviceCapabilities: BluetoothServiceCapabilities = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
@JSGlobal("Windows.Devices.Bluetooth.Background.RfcommInboundConnectionInformation")
@js.native
abstract class RfcommInboundConnectionInformation () extends js.Object {
  /** Gets or sets the service UUID that will be advertised in the SDP record. */
  var localServiceId: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.RfcommNs.RfcommServiceId = js.native
  /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
  var sdpRecord: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets or sets the service capabilities that will be advertised. */
  var serviceCapabilities: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothServiceCapabilities = js.native
}


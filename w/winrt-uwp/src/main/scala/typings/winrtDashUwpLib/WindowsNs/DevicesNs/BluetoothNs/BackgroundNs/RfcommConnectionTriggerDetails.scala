package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth device that caused this trigger to fire. */
@JSGlobal("Windows.Devices.Bluetooth.Background.RfcommConnectionTriggerDetails")
@js.native
abstract class RfcommConnectionTriggerDetails () extends js.Object {
  /** Gets whether this is an incoming connection. */
  var incoming: scala.Boolean = js.native
  /** Gets the BluetoothDevice object that represents the remote device. */
  var remoteDevice: winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothDevice = js.native
  /** Gets a reference to the underlying StreamSocket of this connection. */
  var socket: winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket = js.native
}


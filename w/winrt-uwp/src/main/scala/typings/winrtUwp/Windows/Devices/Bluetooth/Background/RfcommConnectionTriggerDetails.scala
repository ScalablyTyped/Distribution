package typings.winrtUwp.Windows.Devices.Bluetooth.Background

import typings.winrtUwp.Windows.Devices.Bluetooth.BluetoothDevice
import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Bluetooth device that caused this trigger to fire. */
trait RfcommConnectionTriggerDetails extends js.Object {
  /** Gets whether this is an incoming connection. */
  var incoming: Boolean
  /** Gets the BluetoothDevice object that represents the remote device. */
  var remoteDevice: BluetoothDevice
  /** Gets a reference to the underlying StreamSocket of this connection. */
  var socket: StreamSocket
}

object RfcommConnectionTriggerDetails {
  @scala.inline
  def apply(incoming: Boolean, remoteDevice: BluetoothDevice, socket: StreamSocket): RfcommConnectionTriggerDetails = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], remoteDevice = remoteDevice.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommConnectionTriggerDetails]
  }
}


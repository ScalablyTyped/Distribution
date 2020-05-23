package typings.winrtUwp.Windows.Devices.Bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothConnectionStatus extends js.Object

/** Indicates the connection status of the device. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothConnectionStatus")
@js.native
object BluetoothConnectionStatus extends js.Object {
  /** The device is connected. */
  @js.native
  sealed trait connected extends BluetoothConnectionStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected extends BluetoothConnectionStatus
  
}


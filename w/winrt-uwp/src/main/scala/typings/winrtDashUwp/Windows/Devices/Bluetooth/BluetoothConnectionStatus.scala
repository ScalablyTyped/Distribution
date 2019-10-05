package typings.winrtDashUwp.Windows.Devices.Bluetooth

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
  
  /* 1 */ val connected: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.connected with Double = js.native
  /* 0 */ val disconnected: typings.winrtDashUwp.Windows.Devices.Bluetooth.BluetoothConnectionStatus.disconnected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BluetoothConnectionStatus with Double] = js.native
}


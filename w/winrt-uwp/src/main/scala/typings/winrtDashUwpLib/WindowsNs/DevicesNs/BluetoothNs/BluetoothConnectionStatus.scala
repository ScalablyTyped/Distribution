package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

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
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothConnectionStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothConnectionStatus
  
  /* 1 */ val connected: connected with scala.Double = js.native
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothConnectionStatus with scala.Double
  ] = js.native
}


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
  
  val connected: connected with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothConnectionStatus with java.lang.String
  ] = js.native
}


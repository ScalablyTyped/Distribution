package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BluetoothError extends js.Object

/** Specifies common Bluetooth error cases. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothError")
@js.native
object BluetoothError extends js.Object {
  /** The operation cannot be completed because the remote device is not connected. */
  @js.native
  sealed trait deviceNotConnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The operation is disabled by policy. */
  @js.native
  sealed trait disabledByPolicy
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The operation is disabled by the user. */
  @js.native
  sealed trait disabledByUser
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The operation is not supported on the current Bluetooth radio hardware. */
  @js.native
  sealed trait notSupported
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** An unexpected error has occurred. */
  @js.native
  sealed trait otherError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The Bluetooth radio was not available. This error occurs when the Bluetooth radio has been turned off. */
  @js.native
  sealed trait radioNotAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The operation cannot be serviced because the necessary resources are currently in use. */
  @js.native
  sealed trait resourceInUse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  /** The operation was successfully completed or serviced. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError
  
  val deviceNotConnected: deviceNotConnected with java.lang.String = js.native
  val disabledByPolicy: disabledByPolicy with java.lang.String = js.native
  val disabledByUser: disabledByUser with java.lang.String = js.native
  val notSupported: notSupported with java.lang.String = js.native
  val otherError: otherError with java.lang.String = js.native
  val radioNotAvailable: radioNotAvailable with java.lang.String = js.native
  val resourceInUse: resourceInUse with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError with java.lang.String
  ] = js.native
}


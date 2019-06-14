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
  
  /* 3 */ val deviceNotConnected: deviceNotConnected with scala.Double = js.native
  /* 5 */ val disabledByPolicy: disabledByPolicy with scala.Double = js.native
  /* 7 */ val disabledByUser: disabledByUser with scala.Double = js.native
  /* 6 */ val notSupported: notSupported with scala.Double = js.native
  /* 4 */ val otherError: otherError with scala.Double = js.native
  /* 1 */ val radioNotAvailable: radioNotAvailable with scala.Double = js.native
  /* 2 */ val resourceInUse: resourceInUse with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.BluetoothError with scala.Double] = js.native
}


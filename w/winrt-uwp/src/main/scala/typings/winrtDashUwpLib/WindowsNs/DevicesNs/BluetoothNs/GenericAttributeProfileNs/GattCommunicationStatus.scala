package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattCommunicationStatus extends js.Object

/** Represents the return status of a WinRT GATT API related Async operation. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus")
@js.native
object GattCommunicationStatus extends js.Object {
  /** The operation completed successfully. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCommunicationStatus
  
  /** No communication can be performed with the device, at this time. */
  @js.native
  sealed trait unreachable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCommunicationStatus
  
  /* 0 */ val success: success with scala.Double = js.native
  /* 1 */ val unreachable: unreachable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCommunicationStatus with scala.Double
  ] = js.native
}


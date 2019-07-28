package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

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
  sealed trait success extends GattCommunicationStatus
  
  /** No communication can be performed with the device, at this time. */
  @js.native
  sealed trait unreachable extends GattCommunicationStatus
  
  /* 0 */ val success: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCommunicationStatus.success with Double = js.native
  /* 1 */ val unreachable: typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs.GattCommunicationStatus.unreachable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattCommunicationStatus with Double] = js.native
}


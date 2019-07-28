package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.GenericAttributeProfileNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult")
@js.native
abstract class GattReadResult () extends js.Object {
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus = js.native
  /** Gets the value read from the device. */
  var value: IBuffer = js.native
}


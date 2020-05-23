package typings.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult")
@js.native
abstract class GattReadResult ()
  extends typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattReadResult {
  /** Gets the status of an asynchronous operation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus = js.native
  /** Gets the value read from the device. */
  /* CompleteClass */
  override var value: IBuffer = js.native
}


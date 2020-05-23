package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
trait GattReadResult extends js.Object {
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus
  /** Gets the value read from the device. */
  var value: IBuffer
}

object GattReadResult {
  @scala.inline
  def apply(status: GattCommunicationStatus, value: IBuffer): GattReadResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattReadResult]
  }
}


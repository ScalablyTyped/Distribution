package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an asynchronous read operation of a GATT Characteristic or Descriptor value. */
@js.native
trait GattReadResult extends js.Object {
  /** Gets the status of an asynchronous operation. */
  var status: GattCommunicationStatus = js.native
  /** Gets the value read from the device. */
  var value: IBuffer = js.native
}

object GattReadResult {
  @scala.inline
  def apply(status: GattCommunicationStatus, value: IBuffer): GattReadResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattReadResult]
  }
  @scala.inline
  implicit class GattReadResultOps[Self <: GattReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: GattCommunicationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: IBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


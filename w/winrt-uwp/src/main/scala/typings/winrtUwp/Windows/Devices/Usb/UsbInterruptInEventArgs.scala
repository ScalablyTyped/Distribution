package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
@js.native
trait UsbInterruptInEventArgs extends js.Object {
  /** Gets data from the interrupt IN endpoint. */
  var interruptData: IBuffer = js.native
}

object UsbInterruptInEventArgs {
  @scala.inline
  def apply(interruptData: IBuffer): UsbInterruptInEventArgs = {
    val __obj = js.Dynamic.literal(interruptData = interruptData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptInEventArgs]
  }
  @scala.inline
  implicit class UsbInterruptInEventArgsOps[Self <: UsbInterruptInEventArgs] (val x: Self) extends AnyVal {
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
    def setInterruptData(value: IBuffer): Self = this.set("interruptData", value.asInstanceOf[js.Any])
  }
  
}


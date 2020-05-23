package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
trait UsbInterruptInEventArgs extends js.Object {
  /** Gets data from the interrupt IN endpoint. */
  var interruptData: IBuffer
}

object UsbInterruptInEventArgs {
  @scala.inline
  def apply(interruptData: IBuffer): UsbInterruptInEventArgs = {
    val __obj = js.Dynamic.literal(interruptData = interruptData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptInEventArgs]
  }
}


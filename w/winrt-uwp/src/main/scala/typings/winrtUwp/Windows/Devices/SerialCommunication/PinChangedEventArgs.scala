package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
@js.native
trait PinChangedEventArgs extends js.Object {
  /** Gets the type of signal change that caused the event on the serial port. */
  var pinChange: SerialPinChange = js.native
}

object PinChangedEventArgs {
  @scala.inline
  def apply(pinChange: SerialPinChange): PinChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinChange = pinChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinChangedEventArgs]
  }
  @scala.inline
  implicit class PinChangedEventArgsOps[Self <: PinChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setPinChange(value: SerialPinChange): Self = this.set("pinChange", value.asInstanceOf[js.Any])
  }
  
}


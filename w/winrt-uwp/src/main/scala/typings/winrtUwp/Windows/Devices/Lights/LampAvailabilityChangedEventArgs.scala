package typings.winrtUwp.Windows.Devices.Lights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AvailabilityChanged event. */
@js.native
trait LampAvailabilityChangedEventArgs extends js.Object {
  /** Gets a value indicating whether the lamp device that triggered the event is available. */
  var isAvailable: Boolean = js.native
}

object LampAvailabilityChangedEventArgs {
  @scala.inline
  def apply(isAvailable: Boolean): LampAvailabilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LampAvailabilityChangedEventArgs]
  }
  @scala.inline
  implicit class LampAvailabilityChangedEventArgsOps[Self <: LampAvailabilityChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
  }
  
}


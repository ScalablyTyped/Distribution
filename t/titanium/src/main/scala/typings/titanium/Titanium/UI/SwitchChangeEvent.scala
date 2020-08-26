package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the switch value changes.
  */
@js.native
trait SwitchChangeEvent extends SwitchBaseEvent {
  /**
    * New value of the switch.
    */
  var value: Boolean = js.native
}

object SwitchChangeEvent {
  @scala.inline
  def apply(source: Switch, value: Boolean): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEvent]
  }
  @scala.inline
  implicit class SwitchChangeEventOps[Self <: SwitchChangeEvent] (val x: Self) extends AnyVal {
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
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the switch value changes.
  */
trait SwitchChangeEvent extends SwitchBaseEvent {
  /**
    * New value of the switch.
    */
  var value: Boolean
}

object SwitchChangeEvent {
  @scala.inline
  def apply(source: Switch, value: Boolean): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchChangeEvent]
  }
}


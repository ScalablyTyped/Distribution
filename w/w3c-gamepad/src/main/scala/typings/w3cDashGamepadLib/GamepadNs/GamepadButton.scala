package typings
package w3cDashGamepadLib.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadButton extends js.Object {
  var pressed: scala.Boolean
  var value: scala.Double
}

object GamepadButton {
  @scala.inline
  def apply(pressed: scala.Boolean, value: scala.Double): GamepadButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pressed")(pressed)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GamepadButton]
  }
}


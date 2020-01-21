package typings.w3cGamepad.Gamepad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadButton extends js.Object {
  var pressed: Boolean
  var value: Double
}

object GamepadButton {
  @scala.inline
  def apply(pressed: Boolean, value: Double): GamepadButton = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GamepadButton]
  }
}


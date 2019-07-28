package typings.w3cDashGamepad.GamepadNs

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
    val __obj = js.Dynamic.literal(pressed = pressed, value = value)
  
    __obj.asInstanceOf[GamepadButton]
  }
}


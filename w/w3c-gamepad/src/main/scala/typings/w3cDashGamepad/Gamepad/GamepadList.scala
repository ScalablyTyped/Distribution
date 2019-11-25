package typings.w3cDashGamepad.Gamepad

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadList
  extends /* index */ NumberDictionary[typings.w3cDashGamepad.Gamepad.Gamepad] {
  var length: Double
}

object GamepadList {
  @scala.inline
  def apply(
    length: Double,
    NumberDictionary: /* index */ NumberDictionary[typings.w3cDashGamepad.Gamepad.Gamepad] = null
  ): GamepadList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[GamepadList]
  }
}


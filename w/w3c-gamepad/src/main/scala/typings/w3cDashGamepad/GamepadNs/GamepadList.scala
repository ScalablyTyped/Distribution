package typings.w3cDashGamepad.GamepadNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadList extends /* index */ NumberDictionary[Gamepad] {
  var length: Double
}

object GamepadList {
  @scala.inline
  def apply(length: Double, NumberDictionary: /* index */ NumberDictionary[Gamepad] = null): GamepadList = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[GamepadList]
  }
}


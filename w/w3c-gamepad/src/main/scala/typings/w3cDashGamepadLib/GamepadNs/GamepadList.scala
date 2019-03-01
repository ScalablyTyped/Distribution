package typings
package w3cDashGamepadLib.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamepadList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Gamepad] {
  var length: scala.Double
}

object GamepadList {
  @scala.inline
  def apply(
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Gamepad] = null
  ): GamepadList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[GamepadList]
  }
}


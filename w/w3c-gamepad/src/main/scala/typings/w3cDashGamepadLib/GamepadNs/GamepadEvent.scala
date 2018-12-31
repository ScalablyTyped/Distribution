package typings
package w3cDashGamepadLib.GamepadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadEvent
  extends stdLib.Event {
  /**
    * The single gamepad attribute provides access to the associated gamepad data for this event.
    * @readonly
    */
  var gamepad: Gamepad = js.native
}


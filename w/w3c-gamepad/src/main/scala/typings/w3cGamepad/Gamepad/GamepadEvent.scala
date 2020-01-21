package typings.w3cGamepad.Gamepad

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadEvent extends Event_ {
  /**
    * The single gamepad attribute provides access to the associated gamepad data for this event.
    * @readonly
    */
  var gamepad: typings.w3cGamepad.Gamepad.Gamepad = js.native
}


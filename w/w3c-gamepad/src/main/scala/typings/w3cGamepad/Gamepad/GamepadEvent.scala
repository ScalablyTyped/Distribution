package typings.w3cGamepad.Gamepad

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadEvent extends Event {
  
  /**
    * The single gamepad attribute provides access to the associated gamepad data for this event.
    * @readonly
    */
  var gamepad: typings.w3cGamepad.Gamepad.Gamepad = js.native
}

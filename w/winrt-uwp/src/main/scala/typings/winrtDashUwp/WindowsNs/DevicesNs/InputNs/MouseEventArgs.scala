package typings.winrtDashUwp.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the MouseMoved event. */
@JSGlobal("Windows.Devices.Input.MouseEventArgs")
@js.native
abstract class MouseEventArgs () extends js.Object {
  /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
  var mouseDelta: MouseDelta = js.native
}


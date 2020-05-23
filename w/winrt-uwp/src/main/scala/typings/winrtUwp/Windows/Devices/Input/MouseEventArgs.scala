package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the MouseMoved event. */
trait MouseEventArgs extends js.Object {
  /** Gets a value that indicates the change in the screen location of the mouse pointer since the last mouse event. */
  var mouseDelta: MouseDelta
}

object MouseEventArgs {
  @scala.inline
  def apply(mouseDelta: MouseDelta): MouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEventArgs]
  }
}


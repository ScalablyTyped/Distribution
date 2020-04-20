package typings.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocus extends js.Object {
  def focus(): Unit
}

object AnonFocus {
  @scala.inline
  def apply(focus: () => Unit): AnonFocus = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[AnonFocus]
  }
}


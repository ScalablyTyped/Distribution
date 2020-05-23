package typings.uifabricUtilities.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends js.Object {
  def focus(): Unit
}

object Focus {
  @scala.inline
  def apply(focus: () => Unit): Focus = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[Focus]
  }
}


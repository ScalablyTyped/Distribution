package typings.throttleDebounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  def cancel(): Unit
}

object Cancel {
  @scala.inline
  def apply(cancel: () => Unit): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[Cancel]
  }
}


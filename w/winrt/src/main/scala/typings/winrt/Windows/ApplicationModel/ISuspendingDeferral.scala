package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingDeferral extends js.Object {
  def complete(): Unit
}

object ISuspendingDeferral {
  @scala.inline
  def apply(complete: () => Unit): ISuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ISuspendingDeferral]
  }
}


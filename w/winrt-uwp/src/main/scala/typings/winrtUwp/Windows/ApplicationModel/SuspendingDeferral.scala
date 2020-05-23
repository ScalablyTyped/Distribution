package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed app suspending operation. */
trait SuspendingDeferral extends js.Object {
  /** Notifies the operating system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit
}

object SuspendingDeferral {
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
}


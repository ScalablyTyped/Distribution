package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task. */
trait PrintTaskRequestedDeferral extends js.Object {
  /** Indicates when the deferral for the print task request is over. */
  def complete(): Unit
}

object PrintTaskRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskRequestedDeferral]
  }
}


package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to defer the request for a print task source. */
trait PrintTaskSourceRequestedDeferral extends js.Object {
  /** Indicates when the deferral for a print task source request is over. */
  def complete(): Unit
}

object PrintTaskSourceRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
}


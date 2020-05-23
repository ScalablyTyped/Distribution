package typings.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred process that will halt a thread until the deferral is complete. */
trait EmailMailboxChangedDeferral extends js.Object {
  /** Indicates to waiting processes that the deferral is complete. */
  def complete(): Unit
}

object EmailMailboxChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): EmailMailboxChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[EmailMailboxChangedDeferral]
  }
}


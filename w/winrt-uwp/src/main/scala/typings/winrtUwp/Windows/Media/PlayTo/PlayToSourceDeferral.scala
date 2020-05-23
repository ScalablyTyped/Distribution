package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred operation when you're supplying a source media element for Play To. */
trait PlayToSourceDeferral extends js.Object {
  /** Ends the deferral. */
  def complete(): Unit
}

object PlayToSourceDeferral {
  @scala.inline
  def apply(complete: () => Unit): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
}


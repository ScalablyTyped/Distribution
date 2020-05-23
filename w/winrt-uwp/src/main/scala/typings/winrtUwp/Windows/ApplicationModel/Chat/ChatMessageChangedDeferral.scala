package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred asynchronous change request. */
trait ChatMessageChangedDeferral extends js.Object {
  /** Fires to indicate that the deferred change request has completed. */
  def complete(): Unit
}

object ChatMessageChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ChatMessageChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ChatMessageChangedDeferral]
  }
}


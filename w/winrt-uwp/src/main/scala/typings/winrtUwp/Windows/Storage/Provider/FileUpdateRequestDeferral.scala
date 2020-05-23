package typings.winrtUwp.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use to complete an update asynchronously. */
trait FileUpdateRequestDeferral extends js.Object {
  /** Signals that the response to a FileUpdateRequested event is finished. */
  def complete(): Unit
}

object FileUpdateRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
}


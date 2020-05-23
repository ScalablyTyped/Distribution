package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed set version operation. */
trait SetVersionDeferral extends js.Object {
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  def complete(): Unit
}

object SetVersionDeferral {
  @scala.inline
  def apply(complete: () => Unit): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SetVersionDeferral]
  }
}


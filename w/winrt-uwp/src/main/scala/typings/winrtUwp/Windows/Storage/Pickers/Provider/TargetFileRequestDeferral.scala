package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
trait TargetFileRequestDeferral extends js.Object {
  /** Signals that the app providing the save location finished responding to a targetfilerequested event. */
  def complete(): Unit
}

object TargetFileRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): TargetFileRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[TargetFileRequestDeferral]
  }
}


package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task deferral returned by the IBackgroundTaskInstance.GetDeferral method. */
trait BackgroundTaskDeferral extends js.Object {
  /** Informs the system that an asynchronous operation associated with a background task has finished. */
  def complete(): Unit
}

object BackgroundTaskDeferral {
  @scala.inline
  def apply(complete: () => Unit): BackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[BackgroundTaskDeferral]
  }
}


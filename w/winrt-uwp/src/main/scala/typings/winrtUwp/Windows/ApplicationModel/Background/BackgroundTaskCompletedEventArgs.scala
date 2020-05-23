package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents completion information for a task at the time a completion notification is sent. */
trait BackgroundTaskCompletedEventArgs extends js.Object {
  /** Gets the identifier of the background task instance for this completion status notification. */
  var instanceId: String
  /** Throws an exception if the background task completed event has reported an error. */
  def checkResult(): Unit
}

object BackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): BackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskCompletedEventArgs]
  }
}


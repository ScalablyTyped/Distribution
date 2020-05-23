package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents progress information for a task at the time a progress update notification is sent. */
trait BackgroundTaskProgressEventArgs extends js.Object {
  /** Gets the identifier of the background task instance for this progress status notification. */
  var instanceId: String
  /** Gets progress status for a background task instance. */
  var progress: Double
}

object BackgroundTaskProgressEventArgs {
  @scala.inline
  def apply(instanceId: String, progress: Double): BackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskProgressEventArgs]
  }
}


package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundTaskProgressEventArgs extends IBackgroundTaskProgressEventArgs

object BackgroundTaskProgressEventArgs {
  @scala.inline
  def apply(instanceId: String, progress: Double): BackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskProgressEventArgs]
  }
}


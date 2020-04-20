package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskProgressEventArgs extends js.Object {
  var instanceId: String
  var progress: Double
}

object IBackgroundTaskProgressEventArgs {
  @scala.inline
  def apply(instanceId: String, progress: Double): IBackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskProgressEventArgs]
  }
}


package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundTaskCompletedEventArgs extends IBackgroundTaskCompletedEventArgs

object BackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): BackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskCompletedEventArgs]
  }
}


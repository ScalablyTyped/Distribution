package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundTaskDeferral extends IBackgroundTaskDeferral

object BackgroundTaskDeferral {
  @scala.inline
  def apply(complete: () => Unit): BackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[BackgroundTaskDeferral]
  }
}


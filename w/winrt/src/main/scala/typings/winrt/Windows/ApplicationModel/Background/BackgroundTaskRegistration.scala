package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundTaskRegistration extends IBackgroundTaskRegistration

object BackgroundTaskRegistration {
  @scala.inline
  def apply(name: String, oncompleted: js.Any, onprogress: js.Any, taskId: String, unregister: Boolean => Unit): BackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[BackgroundTaskRegistration]
  }
}


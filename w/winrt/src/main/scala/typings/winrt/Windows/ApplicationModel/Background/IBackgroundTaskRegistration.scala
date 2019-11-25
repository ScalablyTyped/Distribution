package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTaskRegistration extends js.Object {
  var name: String
  var oncompleted: js.Any
  var onprogress: js.Any
  var taskId: String
  def unregister(cancelTask: Boolean): Unit
}

object IBackgroundTaskRegistration {
  @scala.inline
  def apply(name: String, oncompleted: js.Any, onprogress: js.Any, taskId: String, unregister: Boolean => Unit): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
}


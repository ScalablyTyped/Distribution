package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents completion information for a task at the time a completion notification is sent. */
@js.native
trait BackgroundTaskCompletedEventArgs extends js.Object {
  /** Gets the identifier of the background task instance for this completion status notification. */
  var instanceId: String = js.native
  /** Throws an exception if the background task completed event has reported an error. */
  def checkResult(): Unit = js.native
}

object BackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): BackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskCompletedEventArgs]
  }
  @scala.inline
  implicit class BackgroundTaskCompletedEventArgsOps[Self <: BackgroundTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckResult(value: () => Unit): Self = this.set("checkResult", js.Any.fromFunction0(value))
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
  }
  
}


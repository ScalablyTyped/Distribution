package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProcessStartEvent extends js.Object {
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution = js.native
  /**
    * The underlying process id.
    */
  val processId: Double = js.native
}

object TaskProcessStartEvent {
  @scala.inline
  def apply(execution: TaskExecution, processId: Double): TaskProcessStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessStartEvent]
  }
  @scala.inline
  implicit class TaskProcessStartEventOps[Self <: TaskProcessStartEvent] (val x: Self) extends AnyVal {
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
    def setExecution(value: TaskExecution): Self = this.set("execution", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
  }
  
}


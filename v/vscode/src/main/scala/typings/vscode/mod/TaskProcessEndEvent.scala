package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProcessEndEvent extends js.Object {
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution = js.native
  /**
    * The process's exit code.
    */
  val exitCode: Double = js.native
}

object TaskProcessEndEvent {
  @scala.inline
  def apply(execution: TaskExecution, exitCode: Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
  @scala.inline
  implicit class TaskProcessEndEventOps[Self <: TaskProcessEndEvent] (val x: Self) extends AnyVal {
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
  }
  
}


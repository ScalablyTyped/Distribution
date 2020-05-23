package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskProcessEndEvent extends js.Object {
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution
  /**
    * The process's exit code.
    */
  val exitCode: Double
}

object TaskProcessEndEvent {
  @scala.inline
  def apply(execution: TaskExecution, exitCode: Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
}


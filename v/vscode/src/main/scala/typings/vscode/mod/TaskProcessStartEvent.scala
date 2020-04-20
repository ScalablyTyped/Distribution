package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskProcessStartEvent extends js.Object {
  /**
  		 * The task execution for which the process got started.
  		 */
  val execution: TaskExecution
  /**
  		 * The underlying process id.
  		 */
  val processId: Double
}

object TaskProcessStartEvent {
  @scala.inline
  def apply(execution: TaskExecution, processId: Double): TaskProcessStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessStartEvent]
  }
}


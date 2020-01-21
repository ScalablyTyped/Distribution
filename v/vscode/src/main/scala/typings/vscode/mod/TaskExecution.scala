package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskExecution extends js.Object {
  /**
  		 * The task that got started.
  		 */
  var task: Task
  /**
  		 * Terminates the task execution.
  		 */
  def terminate(): Unit
}

object TaskExecution {
  @scala.inline
  def apply(task: Task, terminate: () => Unit): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[TaskExecution]
  }
}


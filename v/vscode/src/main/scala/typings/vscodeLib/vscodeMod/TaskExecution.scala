package typings
package vscodeLib.vscodeMod

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
  def terminate(): scala.Unit
}

object TaskExecution {
  @scala.inline
  def apply(task: Task, terminate: () => scala.Unit): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task, terminate = js.Any.fromFunction0(terminate))
  
    __obj.asInstanceOf[TaskExecution]
  }
}


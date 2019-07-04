package typings
package vscodeLib.vscodeMod

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
  val exitCode: scala.Double
}

object TaskProcessEndEvent {
  @scala.inline
  def apply(execution: TaskExecution, exitCode: scala.Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution, exitCode = exitCode)
  
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
}


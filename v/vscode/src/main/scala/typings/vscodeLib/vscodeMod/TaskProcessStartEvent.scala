package typings
package vscodeLib.vscodeMod

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
  val processId: scala.Double
}

object TaskProcessStartEvent {
  @scala.inline
  def apply(execution: TaskExecution, processId: scala.Double): TaskProcessStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution, processId = processId)
  
    __obj.asInstanceOf[TaskProcessStartEvent]
  }
}


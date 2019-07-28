package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An event signaling the start of a task execution.
	 *
	 * This interface is not intended to be implemented.
	 */
trait TaskStartEvent extends js.Object {
  /**
  		 * The task item representing the task that got started.
  		 */
  val execution: TaskExecution
}

object TaskStartEvent {
  @scala.inline
  def apply(execution: TaskExecution): TaskStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution)
  
    __obj.asInstanceOf[TaskStartEvent]
  }
}


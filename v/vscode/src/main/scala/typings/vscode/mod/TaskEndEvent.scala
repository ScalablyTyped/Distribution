package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event signaling the end of an executed task.
  *
  * This interface is not intended to be implemented.
  */
@js.native
trait TaskEndEvent extends js.Object {
  
  /**
    * The task item representing the task that finished.
    */
  val execution: TaskExecution = js.native
}
object TaskEndEvent {
  
  @scala.inline
  def apply(execution: TaskExecution): TaskEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskEndEvent]
  }
  
  @scala.inline
  implicit class TaskEndEventOps[Self <: TaskEndEvent] (val x: Self) extends AnyVal {
    
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
  }
}

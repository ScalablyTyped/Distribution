package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event signaling the start of a task execution.
  *
  * This interface is not intended to be implemented.
  */
@js.native
trait TaskStartEvent extends js.Object {
  
  /**
    * The task item representing the task that got started.
    */
  val execution: TaskExecution = js.native
}
object TaskStartEvent {
  
  @scala.inline
  def apply(execution: TaskExecution): TaskStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStartEvent]
  }
  
  @scala.inline
  implicit class TaskStartEventOps[Self <: TaskStartEvent] (val x: Self) extends AnyVal {
    
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

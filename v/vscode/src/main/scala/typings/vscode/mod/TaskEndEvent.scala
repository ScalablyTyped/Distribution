package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event signaling the end of an executed task.
  *
  * This interface is not intended to be implemented.
  */
@js.native
trait TaskEndEvent extends StObject {
  
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
  implicit class TaskEndEventMutableBuilder[Self <: TaskEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
  }
}

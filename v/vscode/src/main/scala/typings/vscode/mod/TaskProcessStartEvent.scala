package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskProcessStartEvent extends StObject {
  
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution = js.native
  
  /**
    * The underlying process id.
    */
  val processId: Double = js.native
}
object TaskProcessStartEvent {
  
  @scala.inline
  def apply(execution: TaskExecution, processId: Double): TaskProcessStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessStartEvent]
  }
  
  @scala.inline
  implicit class TaskProcessStartEventMutableBuilder[Self <: TaskProcessStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
  }
}

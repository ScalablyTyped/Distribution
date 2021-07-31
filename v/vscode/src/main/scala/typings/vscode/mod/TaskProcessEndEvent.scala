package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskProcessEndEvent extends StObject {
  
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution
  
  /**
    * The process's exit code.
    */
  val exitCode: Double
}
object TaskProcessEndEvent {
  
  @scala.inline
  def apply(execution: TaskExecution, exitCode: Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
  
  @scala.inline
  implicit class TaskProcessEndEventMutableBuilder[Self <: TaskProcessEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}

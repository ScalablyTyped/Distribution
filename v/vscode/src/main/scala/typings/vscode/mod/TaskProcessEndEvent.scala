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
    * The process's exit code. Will be `undefined` when the task is terminated.
    */
  val exitCode: js.UndefOr[Double] = js.undefined
}
object TaskProcessEndEvent {
  
  inline def apply(execution: TaskExecution): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
  
  extension [Self <: TaskProcessEndEvent](x: Self) {
    
    inline def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
  }
}

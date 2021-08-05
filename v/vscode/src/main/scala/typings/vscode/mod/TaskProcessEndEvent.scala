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
  
  inline def apply(execution: TaskExecution, exitCode: Double): TaskProcessEndEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessEndEvent]
  }
  
  extension [Self <: TaskProcessEndEvent](x: Self) {
    
    inline def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}

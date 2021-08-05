package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskProcessStartEvent extends StObject {
  
  /**
    * The task execution for which the process got started.
    */
  val execution: TaskExecution
  
  /**
    * The underlying process id.
    */
  val processId: Double
}
object TaskProcessStartEvent {
  
  inline def apply(execution: TaskExecution, processId: Double): TaskProcessStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProcessStartEvent]
  }
  
  extension [Self <: TaskProcessStartEvent](x: Self) {
    
    inline def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
  }
}

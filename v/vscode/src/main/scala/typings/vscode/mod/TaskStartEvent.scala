package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event signaling the start of a task execution.
  *
  * This interface is not intended to be implemented.
  */
trait TaskStartEvent extends StObject {
  
  /**
    * The task item representing the task that got started.
    */
  val execution: TaskExecution
}
object TaskStartEvent {
  
  inline def apply(execution: TaskExecution): TaskStartEvent = {
    val __obj = js.Dynamic.literal(execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStartEvent]
  }
  
  extension [Self <: TaskStartEvent](x: Self) {
    
    inline def setExecution(value: TaskExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
  }
}

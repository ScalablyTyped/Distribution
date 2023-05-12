package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskExecution extends StObject {
  
  /**
  		 * The task that got started.
  		 */
  var task: Task
  
  /**
  		 * Terminates the task execution.
  		 */
  def terminate(): Unit
}
object TaskExecution {
  
  inline def apply(task: Task, terminate: () => Unit): TaskExecution = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[TaskExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskExecution] (val x: Self) extends AnyVal {
    
    inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}

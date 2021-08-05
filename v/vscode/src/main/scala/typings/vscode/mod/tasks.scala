package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("vscode", "tasks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeTask(task: Task): Thenable[TaskExecution] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeTask")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[TaskExecution]]
  
  inline def fetchTasks(): Thenable[js.Array[Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")().asInstanceOf[Thenable[js.Array[Task]]]
  inline def fetchTasks(filter: TaskFilter): Thenable[js.Array[Task]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTasks")(filter.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.Array[Task]]]
  
  @JSImport("vscode", "tasks.onDidEndTask")
  @js.native
  val onDidEndTask: Event[TaskEndEvent] = js.native
  
  @JSImport("vscode", "tasks.onDidEndTaskProcess")
  @js.native
  val onDidEndTaskProcess: Event[TaskProcessEndEvent] = js.native
  
  @JSImport("vscode", "tasks.onDidStartTask")
  @js.native
  val onDidStartTask: Event[TaskStartEvent] = js.native
  
  @JSImport("vscode", "tasks.onDidStartTaskProcess")
  @js.native
  val onDidStartTaskProcess: Event[TaskProcessStartEvent] = js.native
  
  inline def registerTaskProvider(`type`: String, provider: TaskProvider[Task]): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTaskProvider")(`type`.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  @JSImport("vscode", "tasks.taskExecutions")
  @js.native
  val taskExecutions: js.Array[TaskExecution] = js.native
}

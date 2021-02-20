package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasks {
  
  @JSImport("vscode", "tasks.executeTask")
  @js.native
  def executeTask(task: Task): Thenable[TaskExecution] = js.native
  
  @JSImport("vscode", "tasks.fetchTasks")
  @js.native
  def fetchTasks(): Thenable[js.Array[Task]] = js.native
  @JSImport("vscode", "tasks.fetchTasks")
  @js.native
  def fetchTasks(filter: TaskFilter): Thenable[js.Array[Task]] = js.native
  
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
  
  @JSImport("vscode", "tasks.registerTaskProvider")
  @js.native
  def registerTaskProvider(`type`: String, provider: TaskProvider[Task]): Disposable = js.native
  
  @JSImport("vscode", "tasks.taskExecutions")
  @js.native
  val taskExecutions: js.Array[TaskExecution] = js.native
}

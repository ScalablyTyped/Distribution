package typings.vscode.vscodeMod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "tasks")
@js.native
object tasks extends js.Object {
  val onDidEndTask: Event[TaskEndEvent] = js.native
  val onDidEndTaskProcess: Event[TaskProcessEndEvent] = js.native
  val onDidStartTask: Event[TaskStartEvent] = js.native
  val onDidStartTaskProcess: Event[TaskProcessStartEvent] = js.native
  val taskExecutions: js.Array[TaskExecution] = js.native
  def executeTask(task: Task): Thenable[TaskExecution] = js.native
  def fetchTasks(): Thenable[js.Array[Task]] = js.native
  def fetchTasks(filter: TaskFilter): Thenable[js.Array[Task]] = js.native
  def registerTaskProvider(`type`: String, provider: TaskProvider): Disposable = js.native
}


package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "tasks")
@js.native
object tasksNs extends js.Object {
  val onDidEndTask: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TaskEndEvent] = js.native
  val onDidEndTaskProcess: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TaskProcessEndEvent] = js.native
  val onDidStartTask: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TaskStartEvent] = js.native
  val onDidStartTaskProcess: vscodeLib.vscodeMod.Event[vscodeLib.vscodeMod.TaskProcessStartEvent] = js.native
  val taskExecutions: js.Array[vscodeLib.vscodeMod.TaskExecution] = js.native
  def executeTask(task: vscodeLib.vscodeMod.Task): vscodeLib.Thenable[vscodeLib.vscodeMod.TaskExecution] = js.native
  def fetchTasks(): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Task]] = js.native
  def fetchTasks(filter: vscodeLib.vscodeMod.TaskFilter): vscodeLib.Thenable[js.Array[vscodeLib.vscodeMod.Task]] = js.native
  def registerTaskProvider(`type`: java.lang.String, provider: vscodeLib.vscodeMod.TaskProvider): vscodeLib.vscodeMod.Disposable = js.native
}


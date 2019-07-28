package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskRevealKind extends js.Object

@JSImport("vscode", "TaskRevealKind")
@js.native
object TaskRevealKind extends js.Object {
  /**
  		 * Always brings the terminal to front if the task is executed.
  		 */
  @js.native
  sealed trait Always extends TaskRevealKind
  
  /**
  		 * The terminal never comes to front when the task is executed.
  		 */
  @js.native
  sealed trait Never extends TaskRevealKind
  
  /**
  		 * Only brings the terminal to front if a problem is detected executing the task
  		 * (e.g. the task couldn't be started because).
  		 */
  @js.native
  sealed trait Silent extends TaskRevealKind
  
  /* 1 */ val Always: typings.vscode.vscodeMod.TaskRevealKind.Always with Double = js.native
  /* 3 */ val Never: typings.vscode.vscodeMod.TaskRevealKind.Never with Double = js.native
  /* 2 */ val Silent: typings.vscode.vscodeMod.TaskRevealKind.Silent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskRevealKind with Double] = js.native
}


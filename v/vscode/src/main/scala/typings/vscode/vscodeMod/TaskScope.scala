package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskScope extends js.Object

@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends js.Object {
  /**
  		 * The task is a global task. Global tasks are currrently not supported.
  		 */
  @js.native
  sealed trait Global extends TaskScope
  
  /**
  		 * The task is a workspace task
  		 */
  @js.native
  sealed trait Workspace extends TaskScope
  
  /* 1 */ val Global: typings.vscode.vscodeMod.TaskScope.Global with Double = js.native
  /* 2 */ val Workspace: typings.vscode.vscodeMod.TaskScope.Workspace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskScope with Double] = js.native
}


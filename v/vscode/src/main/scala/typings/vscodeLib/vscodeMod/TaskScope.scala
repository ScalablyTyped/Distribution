package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskScope extends js.Object

@JSImport("vscode", "TaskScope")
@js.native
object TaskScope extends js.Object {
  /**
  		 * The task is a global task
  		 */
  @js.native
  sealed trait Global
    extends vscodeLib.vscodeMod.TaskScope
  
  /**
  		 * The task is a workspace task
  		 */
  @js.native
  sealed trait Workspace
    extends vscodeLib.vscodeMod.TaskScope
  
  /* 1 */ val Global: Global with scala.Double = js.native
  /* 2 */ val Workspace: Workspace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TaskScope with scala.Double] = js.native
}


package typings
package vscodeLib.vscodeMod

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
  sealed trait Always
    extends vscodeLib.vscodeMod.TaskRevealKind
  
  /**
  		 * The terminal never comes to front when the task is executed.
  		 */
  @js.native
  sealed trait Never
    extends vscodeLib.vscodeMod.TaskRevealKind
  
  /**
  		 * Only brings the terminal to front if a problem is detected executing the task
  		 * (e.g. the task couldn't be started because).
  		 */
  @js.native
  sealed trait Silent
    extends vscodeLib.vscodeMod.TaskRevealKind
  
  /* 1 */ val Always: Always with scala.Double = js.native
  /* 3 */ val Never: Never with scala.Double = js.native
  /* 2 */ val Silent: Silent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TaskRevealKind with scala.Double] = js.native
}


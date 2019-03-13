package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskPanelKind extends js.Object

@JSImport("vscode", "TaskPanelKind")
@js.native
object TaskPanelKind extends js.Object {
  /**
  		 * Uses a dedicated panel for this tasks. The panel is not
  		 * shared with other tasks.
  		 */
  @js.native
  sealed trait Dedicated
    extends vscodeLib.vscodeMod.TaskPanelKind
  
  /**
  		 * Creates a new panel whenever this task is executed.
  		 */
  @js.native
  sealed trait New
    extends vscodeLib.vscodeMod.TaskPanelKind
  
  /**
  		 * Shares a panel with other tasks. This is the default.
  		 */
  @js.native
  sealed trait Shared
    extends vscodeLib.vscodeMod.TaskPanelKind
  
  /* 2 */ val Dedicated: Dedicated with scala.Double = js.native
  /* 3 */ val New: New with scala.Double = js.native
  /* 1 */ val Shared: Shared with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TaskPanelKind with scala.Double] = js.native
}


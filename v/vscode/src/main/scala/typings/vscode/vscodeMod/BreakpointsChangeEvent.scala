package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointsChangeEvent extends js.Object {
  /**
  		 * Added breakpoints.
  		 */
  val added: js.Array[Breakpoint]
  /**
  		 * Changed breakpoints.
  		 */
  val changed: js.Array[Breakpoint]
  /**
  		 * Removed breakpoints.
  		 */
  val removed: js.Array[Breakpoint]
}

object BreakpointsChangeEvent {
  @scala.inline
  def apply(added: js.Array[Breakpoint], changed: js.Array[Breakpoint], removed: js.Array[Breakpoint]): BreakpointsChangeEvent = {
    val __obj = js.Dynamic.literal(added = added, changed = changed, removed = removed)
  
    __obj.asInstanceOf[BreakpointsChangeEvent]
  }
}


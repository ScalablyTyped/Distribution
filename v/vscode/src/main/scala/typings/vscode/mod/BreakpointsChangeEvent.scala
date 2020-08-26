package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreakpointsChangeEvent extends js.Object {
  /**
    * Added breakpoints.
    */
  val added: js.Array[Breakpoint] = js.native
  /**
    * Changed breakpoints.
    */
  val changed: js.Array[Breakpoint] = js.native
  /**
    * Removed breakpoints.
    */
  val removed: js.Array[Breakpoint] = js.native
}

object BreakpointsChangeEvent {
  @scala.inline
  def apply(added: js.Array[Breakpoint], changed: js.Array[Breakpoint], removed: js.Array[Breakpoint]): BreakpointsChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsChangeEvent]
  }
  @scala.inline
  implicit class BreakpointsChangeEventOps[Self <: BreakpointsChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddedVarargs(value: Breakpoint*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[Breakpoint]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedVarargs(value: Breakpoint*): Self = this.set("changed", js.Array(value :_*))
    @scala.inline
    def setChanged(value: js.Array[Breakpoint]): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: Breakpoint*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[Breakpoint]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}


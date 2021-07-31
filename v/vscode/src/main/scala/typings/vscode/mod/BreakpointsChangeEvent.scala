package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsChangeEvent extends StObject {
  
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
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsChangeEvent]
  }
  
  @scala.inline
  implicit class BreakpointsChangeEventMutableBuilder[Self <: BreakpointsChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[Breakpoint]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: Breakpoint*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setChanged(value: js.Array[Breakpoint]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedVarargs(value: Breakpoint*): Self = StObject.set(x, "changed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[Breakpoint]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: Breakpoint*): Self = StObject.set(x, "removed", js.Array(value :_*))
  }
}

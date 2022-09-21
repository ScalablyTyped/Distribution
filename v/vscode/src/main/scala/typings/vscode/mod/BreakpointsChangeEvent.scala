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
  
  inline def apply(added: js.Array[Breakpoint], changed: js.Array[Breakpoint], removed: js.Array[Breakpoint]): BreakpointsChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsChangeEvent]
  }
  
  extension [Self <: BreakpointsChangeEvent](x: Self) {
    
    inline def setAdded(value: js.Array[Breakpoint]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Breakpoint*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setChanged(value: js.Array[Breakpoint]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedVarargs(value: Breakpoint*): Self = StObject.set(x, "changed", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Breakpoint]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Breakpoint*): Self = StObject.set(x, "removed", js.Array(value*))
  }
}

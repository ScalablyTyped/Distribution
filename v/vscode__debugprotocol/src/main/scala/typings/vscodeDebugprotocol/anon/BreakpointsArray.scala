package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsArray extends StObject {
  
  /** Information about the breakpoints. The array elements correspond to the elements of the `breakpoints` array. */
  var breakpoints: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]
}
object BreakpointsArray {
  
  inline def apply(breakpoints: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]): BreakpointsArray = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointsArray] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: js.Array[typings.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: typings.vscodeDebugprotocol.mod.DebugProtocol.Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}

package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setFunctionBreakpoints` request. */
trait SetFunctionBreakpointsArguments extends StObject {
  
  /** The function names of the breakpoints. */
  var breakpoints: js.Array[FunctionBreakpoint]
}
object SetFunctionBreakpointsArguments {
  
  inline def apply(breakpoints: js.Array[FunctionBreakpoint]): SetFunctionBreakpointsArguments = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFunctionBreakpointsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetFunctionBreakpointsArguments] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: js.Array[FunctionBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: FunctionBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}

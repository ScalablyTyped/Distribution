package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setDataBreakpoints` request. */
trait SetDataBreakpointsArguments extends StObject {
  
  /** The contents of this array replaces all existing data breakpoints. An empty array clears all data breakpoints. */
  var breakpoints: js.Array[DataBreakpoint]
}
object SetDataBreakpointsArguments {
  
  inline def apply(breakpoints: js.Array[DataBreakpoint]): SetDataBreakpointsArguments = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataBreakpointsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDataBreakpointsArguments] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: js.Array[DataBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: DataBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}

package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setInstructionBreakpoints` request */
trait SetInstructionBreakpointsArguments extends StObject {
  
  /** The instruction references of the breakpoints */
  var breakpoints: js.Array[InstructionBreakpoint]
}
object SetInstructionBreakpointsArguments {
  
  inline def apply(breakpoints: js.Array[InstructionBreakpoint]): SetInstructionBreakpointsArguments = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstructionBreakpointsArguments]
  }
  
  extension [Self <: SetInstructionBreakpointsArguments](x: Self) {
    
    inline def setBreakpoints(value: js.Array[InstructionBreakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: InstructionBreakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value*))
  }
}

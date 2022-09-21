package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a breakpoint passed to the setInstructionBreakpoints request */
trait InstructionBreakpoint extends StObject {
  
  /** An expression for conditional breakpoints.
  			It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
  		*/
  var condition: js.UndefOr[String] = js.undefined
  
  /** An expression that controls how many hits of the breakpoint are ignored.
  			The debug adapter is expected to interpret the expression as needed.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
  		*/
  var hitCondition: js.UndefOr[String] = js.undefined
  
  /** The instruction reference of the breakpoint.
  			This should be a memory or instruction pointer reference from an EvaluateResponse, Variable, StackFrame, GotoTarget, or Breakpoint.
  		*/
  var instructionReference: String
  
  /** The offset from the instruction reference.
  			This can be negative.
  		*/
  var offset: js.UndefOr[Double] = js.undefined
}
object InstructionBreakpoint {
  
  inline def apply(instructionReference: String): InstructionBreakpoint = {
    val __obj = js.Dynamic.literal(instructionReference = instructionReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionBreakpoint]
  }
  
  extension [Self <: InstructionBreakpoint](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setHitCondition(value: String): Self = StObject.set(x, "hitCondition", value.asInstanceOf[js.Any])
    
    inline def setHitConditionUndefined: Self = StObject.set(x, "hitCondition", js.undefined)
    
    inline def setInstructionReference(value: String): Self = StObject.set(x, "instructionReference", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}

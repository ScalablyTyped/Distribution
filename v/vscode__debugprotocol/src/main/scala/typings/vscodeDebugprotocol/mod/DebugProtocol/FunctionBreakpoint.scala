package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a breakpoint passed to the `setFunctionBreakpoints` request. */
trait FunctionBreakpoint extends StObject {
  
  /** An expression for conditional breakpoints.
  			It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
  		*/
  var condition: js.UndefOr[String] = js.undefined
  
  /** An expression that controls how many hits of the breakpoint are ignored.
  			The debug adapter is expected to interpret the expression as needed.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
  		*/
  var hitCondition: js.UndefOr[String] = js.undefined
  
  /** The name of the function. */
  var name: String
}
object FunctionBreakpoint {
  
  inline def apply(name: String): FunctionBreakpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionBreakpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionBreakpoint] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setHitCondition(value: String): Self = StObject.set(x, "hitCondition", value.asInstanceOf[js.Any])
    
    inline def setHitConditionUndefined: Self = StObject.set(x, "hitCondition", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

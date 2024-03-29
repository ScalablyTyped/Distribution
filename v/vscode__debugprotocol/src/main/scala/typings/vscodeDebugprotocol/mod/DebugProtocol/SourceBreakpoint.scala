package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a breakpoint or logpoint passed to the `setBreakpoints` request. */
trait SourceBreakpoint extends StObject {
  
  /** Start position within source line of the breakpoint or logpoint. It is measured in UTF-16 code units and the client capability `columnsStartAt1` determines whether it is 0- or 1-based. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The expression for conditional breakpoints.
  			It is only honored by a debug adapter if the corresponding capability `supportsConditionalBreakpoints` is true.
  		*/
  var condition: js.UndefOr[String] = js.undefined
  
  /** The expression that controls how many hits of the breakpoint are ignored.
  			The debug adapter is expected to interpret the expression as needed.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsHitConditionalBreakpoints` is true.
  			If both this property and `condition` are specified, `hitCondition` should be evaluated only if the `condition` is met, and the debug adapter should stop only if both conditions are met.
  		*/
  var hitCondition: js.UndefOr[String] = js.undefined
  
  /** The source line of the breakpoint or logpoint. */
  var line: Double
  
  /** If this attribute exists and is non-empty, the debug adapter must not 'break' (stop)
  			but log the message instead. Expressions within `{}` are interpolated.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsLogPoints` is true.
  			If either `hitCondition` or `condition` is specified, then the message should only be logged if those conditions are met.
  		*/
  var logMessage: js.UndefOr[String] = js.undefined
}
object SourceBreakpoint {
  
  inline def apply(line: Double): SourceBreakpoint = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBreakpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceBreakpoint] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setHitCondition(value: String): Self = StObject.set(x, "hitCondition", value.asInstanceOf[js.Any])
    
    inline def setHitConditionUndefined: Self = StObject.set(x, "hitCondition", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLogMessage(value: String): Self = StObject.set(x, "logMessage", value.asInstanceOf[js.Any])
    
    inline def setLogMessageUndefined: Self = StObject.set(x, "logMessage", js.undefined)
  }
}

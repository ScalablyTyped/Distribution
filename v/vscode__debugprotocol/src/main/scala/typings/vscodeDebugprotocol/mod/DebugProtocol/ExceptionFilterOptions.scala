package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ExceptionFilterOptions is used to specify an exception filter together with a condition for the `setExceptionBreakpoints` request. */
trait ExceptionFilterOptions extends StObject {
  
  /** An expression for conditional exceptions.
  			The exception breaks into the debugger if the result of the condition is true.
  		*/
  var condition: js.UndefOr[String] = js.undefined
  
  /** ID of an exception filter returned by the `exceptionBreakpointFilters` capability. */
  var filterId: String
}
object ExceptionFilterOptions {
  
  inline def apply(filterId: String): ExceptionFilterOptions = {
    val __obj = js.Dynamic.literal(filterId = filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionFilterOptions]
  }
  
  extension [Self <: ExceptionFilterOptions](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
  }
}

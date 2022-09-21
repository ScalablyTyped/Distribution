package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `setExceptionBreakpoints` request. */
trait SetExceptionBreakpointsArguments extends StObject {
  
  /** Configuration options for selected exceptions.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionOptions` is true.
  		*/
  var exceptionOptions: js.UndefOr[js.Array[ExceptionOptions]] = js.undefined
  
  /** Set of exception filters and their options. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. This attribute is only honored by a debug adapter if the corresponding capability `supportsExceptionFilterOptions` is true. The `filter` and `filterOptions` sets are additive. */
  var filterOptions: js.UndefOr[js.Array[ExceptionFilterOptions]] = js.undefined
  
  /** Set of exception filters specified by their ID. The set of all possible exception filters is defined by the `exceptionBreakpointFilters` capability. The `filter` and `filterOptions` sets are additive. */
  var filters: js.Array[String]
}
object SetExceptionBreakpointsArguments {
  
  inline def apply(filters: js.Array[String]): SetExceptionBreakpointsArguments = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExceptionBreakpointsArguments]
  }
  
  extension [Self <: SetExceptionBreakpointsArguments](x: Self) {
    
    inline def setExceptionOptions(value: js.Array[ExceptionOptions]): Self = StObject.set(x, "exceptionOptions", value.asInstanceOf[js.Any])
    
    inline def setExceptionOptionsUndefined: Self = StObject.set(x, "exceptionOptions", js.undefined)
    
    inline def setExceptionOptionsVarargs(value: ExceptionOptions*): Self = StObject.set(x, "exceptionOptions", js.Array(value*))
    
    inline def setFilterOptions(value: js.Array[ExceptionFilterOptions]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    inline def setFilterOptionsVarargs(value: ExceptionFilterOptions*): Self = StObject.set(x, "filterOptions", js.Array(value*))
    
    inline def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}

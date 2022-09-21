package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ExceptionBreakpointsFilter is shown in the UI as an filter option for configuring how exceptions are dealt with. */
trait ExceptionBreakpointsFilter extends StObject {
  
  /** Initial value of the filter option. If not specified a value `false` is assumed. */
  var default: js.UndefOr[Boolean] = js.undefined
  
  /** A help text providing information about the condition. This string is shown as the placeholder text for a text box and can be translated. */
  var conditionDescription: js.UndefOr[String] = js.undefined
  
  /** A help text providing additional information about the exception filter. This string is typically shown as a hover and can be translated. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The internal ID of the filter option. This value is passed to the `setExceptionBreakpoints` request. */
  var filter: String
  
  /** The name of the filter option. This is shown in the UI. */
  var label: String
  
  /** Controls whether a condition can be specified for this filter option. If false or missing, a condition can not be set. */
  var supportsCondition: js.UndefOr[Boolean] = js.undefined
}
object ExceptionBreakpointsFilter {
  
  inline def apply(filter: String, label: String): ExceptionBreakpointsFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionBreakpointsFilter]
  }
  
  extension [Self <: ExceptionBreakpointsFilter](x: Self) {
    
    inline def setConditionDescription(value: String): Self = StObject.set(x, "conditionDescription", value.asInstanceOf[js.Any])
    
    inline def setConditionDescriptionUndefined: Self = StObject.set(x, "conditionDescription", js.undefined)
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSupportsCondition(value: Boolean): Self = StObject.set(x, "supportsCondition", value.asInstanceOf[js.Any])
    
    inline def setSupportsConditionUndefined: Self = StObject.set(x, "supportsCondition", js.undefined)
  }
}

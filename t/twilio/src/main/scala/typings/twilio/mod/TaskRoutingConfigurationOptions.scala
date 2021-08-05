package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRoutingConfigurationOptions extends StObject {
  
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  
  var filters: js.Array[WorkflowRuleOptions]
}
object TaskRoutingConfigurationOptions {
  
  inline def apply(filters: js.Array[WorkflowRuleOptions]): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
  
  extension [Self <: TaskRoutingConfigurationOptions](x: Self) {
    
    inline def setDefaultFilter(value: WorkflowRuleOptions): Self = StObject.set(x, "defaultFilter", value.asInstanceOf[js.Any])
    
    inline def setDefaultFilterUndefined: Self = StObject.set(x, "defaultFilter", js.undefined)
    
    inline def setDefault_filter(value: WorkflowRuleOptions): Self = StObject.set(x, "default_filter", value.asInstanceOf[js.Any])
    
    inline def setDefault_filterUndefined: Self = StObject.set(x, "default_filter", js.undefined)
    
    inline def setFilters(value: js.Array[WorkflowRuleOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: WorkflowRuleOptions*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}

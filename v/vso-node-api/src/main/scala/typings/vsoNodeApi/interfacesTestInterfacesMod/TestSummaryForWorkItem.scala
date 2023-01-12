package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSummaryForWorkItem extends StObject {
  
  var summary: AggregatedDataForResultTrend
  
  var workItem: WorkItemReference
}
object TestSummaryForWorkItem {
  
  inline def apply(summary: AggregatedDataForResultTrend, workItem: WorkItemReference): TestSummaryForWorkItem = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSummaryForWorkItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestSummaryForWorkItem] (val x: Self) extends AnyVal {
    
    inline def setSummary(value: AggregatedDataForResultTrend): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setWorkItem(value: WorkItemReference): Self = StObject.set(x, "workItem", value.asInstanceOf[js.Any])
  }
}

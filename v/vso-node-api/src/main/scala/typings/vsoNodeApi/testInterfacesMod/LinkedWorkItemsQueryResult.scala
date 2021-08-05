package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedWorkItemsQueryResult extends StObject {
  
  var automatedTestName: String
  
  var planId: Double
  
  var pointId: Double
  
  var suiteId: Double
  
  var testCaseId: Double
  
  var workItems: js.Array[WorkItemReference]
}
object LinkedWorkItemsQueryResult {
  
  inline def apply(
    automatedTestName: String,
    planId: Double,
    pointId: Double,
    suiteId: Double,
    testCaseId: Double,
    workItems: js.Array[WorkItemReference]
  ): LinkedWorkItemsQueryResult = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], pointId = pointId.asInstanceOf[js.Any], suiteId = suiteId.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
  
  extension [Self <: LinkedWorkItemsQueryResult](x: Self) {
    
    inline def setAutomatedTestName(value: String): Self = StObject.set(x, "automatedTestName", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: Double): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPointId(value: Double): Self = StObject.set(x, "pointId", value.asInstanceOf[js.Any])
    
    inline def setSuiteId(value: Double): Self = StObject.set(x, "suiteId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseId(value: Double): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: js.Array[WorkItemReference]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsVarargs(value: WorkItemReference*): Self = StObject.set(x, "workItems", js.Array(value :_*))
  }
}

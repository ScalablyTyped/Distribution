package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedWorkItemsQuery extends StObject {
  
  var automatedTestNames: js.Array[String]
  
  var planId: Double
  
  var pointIds: js.Array[Double]
  
  var suiteIds: js.Array[Double]
  
  var testCaseIds: js.Array[Double]
  
  var workItemCategory: String
}
object LinkedWorkItemsQuery {
  
  inline def apply(
    automatedTestNames: js.Array[String],
    planId: Double,
    pointIds: js.Array[Double],
    suiteIds: js.Array[Double],
    testCaseIds: js.Array[Double],
    workItemCategory: String
  ): LinkedWorkItemsQuery = {
    val __obj = js.Dynamic.literal(automatedTestNames = automatedTestNames.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], pointIds = pointIds.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any], testCaseIds = testCaseIds.asInstanceOf[js.Any], workItemCategory = workItemCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedWorkItemsQuery]
  }
  
  extension [Self <: LinkedWorkItemsQuery](x: Self) {
    
    inline def setAutomatedTestNames(value: js.Array[String]): Self = StObject.set(x, "automatedTestNames", value.asInstanceOf[js.Any])
    
    inline def setAutomatedTestNamesVarargs(value: String*): Self = StObject.set(x, "automatedTestNames", js.Array(value*))
    
    inline def setPlanId(value: Double): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPointIds(value: js.Array[Double]): Self = StObject.set(x, "pointIds", value.asInstanceOf[js.Any])
    
    inline def setPointIdsVarargs(value: Double*): Self = StObject.set(x, "pointIds", js.Array(value*))
    
    inline def setSuiteIds(value: js.Array[Double]): Self = StObject.set(x, "suiteIds", value.asInstanceOf[js.Any])
    
    inline def setSuiteIdsVarargs(value: Double*): Self = StObject.set(x, "suiteIds", js.Array(value*))
    
    inline def setTestCaseIds(value: js.Array[Double]): Self = StObject.set(x, "testCaseIds", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdsVarargs(value: Double*): Self = StObject.set(x, "testCaseIds", js.Array(value*))
    
    inline def setWorkItemCategory(value: String): Self = StObject.set(x, "workItemCategory", value.asInstanceOf[js.Any])
  }
}

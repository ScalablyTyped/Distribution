package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedWorkItemsQuery extends StObject {
  
  var automatedTestNames: js.Array[String] = js.native
  
  var planId: Double = js.native
  
  var pointIds: js.Array[Double] = js.native
  
  var suiteIds: js.Array[Double] = js.native
  
  var testCaseIds: js.Array[Double] = js.native
  
  var workItemCategory: String = js.native
}
object LinkedWorkItemsQuery {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LinkedWorkItemsQueryMutableBuilder[Self <: LinkedWorkItemsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedTestNames(value: js.Array[String]): Self = StObject.set(x, "automatedTestNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedTestNamesVarargs(value: String*): Self = StObject.set(x, "automatedTestNames", js.Array(value :_*))
    
    @scala.inline
    def setPlanId(value: Double): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIds(value: js.Array[Double]): Self = StObject.set(x, "pointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIdsVarargs(value: Double*): Self = StObject.set(x, "pointIds", js.Array(value :_*))
    
    @scala.inline
    def setSuiteIds(value: js.Array[Double]): Self = StObject.set(x, "suiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteIdsVarargs(value: Double*): Self = StObject.set(x, "suiteIds", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseIds(value: js.Array[Double]): Self = StObject.set(x, "testCaseIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdsVarargs(value: Double*): Self = StObject.set(x, "testCaseIds", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemCategory(value: String): Self = StObject.set(x, "workItemCategory", value.asInstanceOf[js.Any])
  }
}

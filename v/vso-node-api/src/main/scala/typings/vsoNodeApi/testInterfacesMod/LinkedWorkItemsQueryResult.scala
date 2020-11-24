package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedWorkItemsQueryResult extends js.Object {
  
  var automatedTestName: String = js.native
  
  var planId: Double = js.native
  
  var pointId: Double = js.native
  
  var suiteId: Double = js.native
  
  var testCaseId: Double = js.native
  
  var workItems: js.Array[WorkItemReference] = js.native
}
object LinkedWorkItemsQueryResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LinkedWorkItemsQueryResultOps[Self <: LinkedWorkItemsQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutomatedTestName(value: String): Self = this.set("automatedTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: Double): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointId(value: Double): Self = this.set("pointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteId(value: Double): Self = this.set("suiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseId(value: Double): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: WorkItemReference*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[WorkItemReference]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
}

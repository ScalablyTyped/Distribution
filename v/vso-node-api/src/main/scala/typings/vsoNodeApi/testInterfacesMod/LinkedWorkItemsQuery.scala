package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedWorkItemsQuery extends js.Object {
  
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
  implicit class LinkedWorkItemsQueryOps[Self <: LinkedWorkItemsQuery] (val x: Self) extends AnyVal {
    
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
    def setAutomatedTestNamesVarargs(value: String*): Self = this.set("automatedTestNames", js.Array(value :_*))
    
    @scala.inline
    def setAutomatedTestNames(value: js.Array[String]): Self = this.set("automatedTestNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: Double): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointIdsVarargs(value: Double*): Self = this.set("pointIds", js.Array(value :_*))
    
    @scala.inline
    def setPointIds(value: js.Array[Double]): Self = this.set("pointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuiteIdsVarargs(value: Double*): Self = this.set("suiteIds", js.Array(value :_*))
    
    @scala.inline
    def setSuiteIds(value: js.Array[Double]): Self = this.set("suiteIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdsVarargs(value: Double*): Self = this.set("testCaseIds", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseIds(value: js.Array[Double]): Self = this.set("testCaseIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemCategory(value: String): Self = this.set("workItemCategory", value.asInstanceOf[js.Any])
  }
}

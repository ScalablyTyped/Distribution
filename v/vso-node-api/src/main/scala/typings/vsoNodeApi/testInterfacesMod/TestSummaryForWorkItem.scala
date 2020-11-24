package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSummaryForWorkItem extends js.Object {
  
  var summary: AggregatedDataForResultTrend = js.native
  
  var workItem: WorkItemReference = js.native
}
object TestSummaryForWorkItem {
  
  @scala.inline
  def apply(summary: AggregatedDataForResultTrend, workItem: WorkItemReference): TestSummaryForWorkItem = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSummaryForWorkItem]
  }
  
  @scala.inline
  implicit class TestSummaryForWorkItemOps[Self <: TestSummaryForWorkItem] (val x: Self) extends AnyVal {
    
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
    def setSummary(value: AggregatedDataForResultTrend): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItem(value: WorkItemReference): Self = this.set("workItem", value.asInstanceOf[js.Any])
  }
}

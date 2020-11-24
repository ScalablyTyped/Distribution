package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultHistoryDetailsForGroup extends js.Object {
  
  var groupByValue: js.Any = js.native
  
  var latestResult: TestCaseResult = js.native
}
object TestResultHistoryDetailsForGroup {
  
  @scala.inline
  def apply(groupByValue: js.Any, latestResult: TestCaseResult): TestResultHistoryDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], latestResult = latestResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistoryDetailsForGroup]
  }
  
  @scala.inline
  implicit class TestResultHistoryDetailsForGroupOps[Self <: TestResultHistoryDetailsForGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupByValue(value: js.Any): Self = this.set("groupByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestResult(value: TestCaseResult): Self = this.set("latestResult", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultHistory extends js.Object {
  
  var groupByField: String = js.native
  
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup] = js.native
}
object TestResultHistory {
  
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistory]
  }
  
  @scala.inline
  implicit class TestResultHistoryOps[Self <: TestResultHistory] (val x: Self) extends AnyVal {
    
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
    def setGroupByField(value: String): Self = this.set("groupByField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsForGroupVarargs(value: TestResultHistoryDetailsForGroup*): Self = this.set("resultsForGroup", js.Array(value :_*))
    
    @scala.inline
    def setResultsForGroup(value: js.Array[TestResultHistoryDetailsForGroup]): Self = this.set("resultsForGroup", value.asInstanceOf[js.Any])
  }
}

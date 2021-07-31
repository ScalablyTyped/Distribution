package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultHistoryDetailsForGroup extends StObject {
  
  var groupByValue: js.Any
  
  var latestResult: TestCaseResult
}
object TestResultHistoryDetailsForGroup {
  
  @scala.inline
  def apply(groupByValue: js.Any, latestResult: TestCaseResult): TestResultHistoryDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], latestResult = latestResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistoryDetailsForGroup]
  }
  
  @scala.inline
  implicit class TestResultHistoryDetailsForGroupMutableBuilder[Self <: TestResultHistoryDetailsForGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByValue(value: js.Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestResult(value: TestCaseResult): Self = StObject.set(x, "latestResult", value.asInstanceOf[js.Any])
  }
}

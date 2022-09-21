package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultHistoryDetailsForGroup extends StObject {
  
  var groupByValue: Any
  
  var latestResult: TestCaseResult
}
object TestResultHistoryDetailsForGroup {
  
  inline def apply(groupByValue: Any, latestResult: TestCaseResult): TestResultHistoryDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], latestResult = latestResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistoryDetailsForGroup]
  }
  
  extension [Self <: TestResultHistoryDetailsForGroup](x: Self) {
    
    inline def setGroupByValue(value: Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    inline def setLatestResult(value: TestCaseResult): Self = StObject.set(x, "latestResult", value.asInstanceOf[js.Any])
  }
}

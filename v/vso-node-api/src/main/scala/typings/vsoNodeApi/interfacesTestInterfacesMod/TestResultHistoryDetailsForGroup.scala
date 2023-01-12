package typings.vsoNodeApi.interfacesTestInterfacesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestResultHistoryDetailsForGroup] (val x: Self) extends AnyVal {
    
    inline def setGroupByValue(value: Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    inline def setLatestResult(value: TestCaseResult): Self = StObject.set(x, "latestResult", value.asInstanceOf[js.Any])
  }
}

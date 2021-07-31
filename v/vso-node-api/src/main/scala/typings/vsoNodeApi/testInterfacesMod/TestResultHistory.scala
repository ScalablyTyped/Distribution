package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultHistory extends StObject {
  
  var groupByField: String
  
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]
}
object TestResultHistory {
  
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistory]
  }
  
  @scala.inline
  implicit class TestResultHistoryMutableBuilder[Self <: TestResultHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsForGroup(value: js.Array[TestResultHistoryDetailsForGroup]): Self = StObject.set(x, "resultsForGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsForGroupVarargs(value: TestResultHistoryDetailsForGroup*): Self = StObject.set(x, "resultsForGroup", js.Array(value :_*))
  }
}

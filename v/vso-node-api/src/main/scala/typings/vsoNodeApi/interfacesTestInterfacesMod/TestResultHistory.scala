package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultHistory extends StObject {
  
  var groupByField: String
  
  var resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]
}
object TestResultHistory {
  
  inline def apply(groupByField: String, resultsForGroup: js.Array[TestResultHistoryDetailsForGroup]): TestResultHistory = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultHistory]
  }
  
  extension [Self <: TestResultHistory](x: Self) {
    
    inline def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    inline def setResultsForGroup(value: js.Array[TestResultHistoryDetailsForGroup]): Self = StObject.set(x, "resultsForGroup", value.asInstanceOf[js.Any])
    
    inline def setResultsForGroupVarargs(value: TestResultHistoryDetailsForGroup*): Self = StObject.set(x, "resultsForGroup", js.Array(value*))
  }
}

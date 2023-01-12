package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultsDetails extends StObject {
  
  var groupByField: String
  
  var resultsForGroup: js.Array[TestResultsDetailsForGroup]
}
object TestResultsDetails {
  
  inline def apply(groupByField: String, resultsForGroup: js.Array[TestResultsDetailsForGroup]): TestResultsDetails = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestResultsDetails] (val x: Self) extends AnyVal {
    
    inline def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    inline def setResultsForGroup(value: js.Array[TestResultsDetailsForGroup]): Self = StObject.set(x, "resultsForGroup", value.asInstanceOf[js.Any])
    
    inline def setResultsForGroupVarargs(value: TestResultsDetailsForGroup*): Self = StObject.set(x, "resultsForGroup", js.Array(value*))
  }
}

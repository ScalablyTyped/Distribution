package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsDetails extends StObject {
  
  var groupByField: String = js.native
  
  var resultsForGroup: js.Array[TestResultsDetailsForGroup] = js.native
}
object TestResultsDetails {
  
  @scala.inline
  def apply(groupByField: String, resultsForGroup: js.Array[TestResultsDetailsForGroup]): TestResultsDetails = {
    val __obj = js.Dynamic.literal(groupByField = groupByField.asInstanceOf[js.Any], resultsForGroup = resultsForGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetails]
  }
  
  @scala.inline
  implicit class TestResultsDetailsMutableBuilder[Self <: TestResultsDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsForGroup(value: js.Array[TestResultsDetailsForGroup]): Self = StObject.set(x, "resultsForGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsForGroupVarargs(value: TestResultsDetailsForGroup*): Self = StObject.set(x, "resultsForGroup", js.Array(value :_*))
  }
}

package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultsDetailsForGroup extends StObject {
  
  var groupByValue: js.Any = js.native
  
  var results: js.Array[TestCaseResult] = js.native
  
  var resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
}
object TestResultsDetailsForGroup {
  
  @scala.inline
  def apply(
    groupByValue: js.Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsCountByOutcome = resultsCountByOutcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
  
  @scala.inline
  implicit class TestResultsDetailsForGroupMutableBuilder[Self <: TestResultsDetailsForGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByValue(value: js.Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsCountByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsCountByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: TestCaseResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}

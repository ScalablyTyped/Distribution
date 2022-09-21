package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultsDetailsForGroup extends StObject {
  
  var groupByValue: Any
  
  var results: js.Array[TestCaseResult]
  
  var resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
}
object TestResultsDetailsForGroup {
  
  inline def apply(
    groupByValue: Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], resultsCountByOutcome = resultsCountByOutcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
  
  extension [Self <: TestResultsDetailsForGroup](x: Self) {
    
    inline def setGroupByValue(value: Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsCountByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsCountByOutcome", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: TestCaseResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}

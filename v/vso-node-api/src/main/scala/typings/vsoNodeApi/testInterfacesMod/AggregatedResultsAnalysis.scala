package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultsAnalysis extends StObject {
  
  var duration: js.Any
  
  var notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  
  var previousContext: TestResultsContext
  
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  
  var resultsDifference: AggregatedResultsDifference
  
  var totalTests: Double
}
object AggregatedResultsAnalysis {
  
  inline def apply(
    duration: js.Any,
    notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    previousContext: TestResultsContext,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    resultsDifference: AggregatedResultsDifference,
    totalTests: Double
  ): AggregatedResultsAnalysis = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], notReportedResultsByOutcome = notReportedResultsByOutcome.asInstanceOf[js.Any], previousContext = previousContext.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], resultsDifference = resultsDifference.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsAnalysis]
  }
  
  extension [Self <: AggregatedResultsAnalysis](x: Self) {
    
    inline def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNotReportedResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "notReportedResultsByOutcome", value.asInstanceOf[js.Any])
    
    inline def setPreviousContext(value: TestResultsContext): Self = StObject.set(x, "previousContext", value.asInstanceOf[js.Any])
    
    inline def setResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsByOutcome", value.asInstanceOf[js.Any])
    
    inline def setResultsDifference(value: AggregatedResultsDifference): Self = StObject.set(x, "resultsDifference", value.asInstanceOf[js.Any])
    
    inline def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
  }
}

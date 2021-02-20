package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedResultsAnalysis extends StObject {
  
  var duration: js.Any = js.native
  
  var notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  
  var previousContext: TestResultsContext = js.native
  
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  
  var resultsDifference: AggregatedResultsDifference = js.native
  
  var totalTests: Double = js.native
}
object AggregatedResultsAnalysis {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AggregatedResultsAnalysisMutableBuilder[Self <: AggregatedResultsAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotReportedResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "notReportedResultsByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousContext(value: TestResultsContext): Self = StObject.set(x, "previousContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsDifference(value: AggregatedResultsDifference): Self = StObject.set(x, "resultsDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
  }
}

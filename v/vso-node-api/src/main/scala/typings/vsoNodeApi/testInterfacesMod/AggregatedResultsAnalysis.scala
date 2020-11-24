package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedResultsAnalysis extends js.Object {
  
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
  implicit class AggregatedResultsAnalysisOps[Self <: AggregatedResultsAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotReportedResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = this.set("notReportedResultsByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousContext(value: TestResultsContext): Self = this.set("previousContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = this.set("resultsByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsDifference(value: AggregatedResultsDifference): Self = this.set("resultsDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTests(value: Double): Self = this.set("totalTests", value.asInstanceOf[js.Any])
  }
}

package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsAnalysis extends js.Object {
  var duration: js.Any
  var notReportedResultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  var previousContext: TestResultsContext
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  var resultsDifference: AggregatedResultsDifference
  var totalTests: Double
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
}


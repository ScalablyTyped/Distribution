package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsAnalysis extends js.Object {
  var duration: js.Any
  var notReportedResultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  var previousContext: TestResultsContext
  var resultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  var resultsDifference: AggregatedResultsDifference
  var totalTests: scala.Double
}

object AggregatedResultsAnalysis {
  @scala.inline
  def apply(
    duration: js.Any,
    notReportedResultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome],
    previousContext: TestResultsContext,
    resultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome],
    resultsDifference: AggregatedResultsDifference,
    totalTests: scala.Double
  ): AggregatedResultsAnalysis = {
    val __obj = js.Dynamic.literal(duration = duration, notReportedResultsByOutcome = notReportedResultsByOutcome, previousContext = previousContext, resultsByOutcome = resultsByOutcome, resultsDifference = resultsDifference, totalTests = totalTests)
  
    __obj.asInstanceOf[AggregatedResultsAnalysis]
  }
}


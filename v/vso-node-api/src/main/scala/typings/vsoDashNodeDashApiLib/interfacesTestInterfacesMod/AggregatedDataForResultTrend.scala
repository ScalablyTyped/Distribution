package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedDataForResultTrend extends js.Object {
  /**
    * This is tests execution duration.
    */
  var duration: js.Any
  var resultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  var testResultsContext: TestResultsContext
  var totalTests: scala.Double
}

object AggregatedDataForResultTrend {
  @scala.inline
  def apply(
    duration: js.Any,
    resultsByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome],
    testResultsContext: TestResultsContext,
    totalTests: scala.Double
  ): AggregatedDataForResultTrend = {
    val __obj = js.Dynamic.literal(duration = duration, resultsByOutcome = resultsByOutcome, testResultsContext = testResultsContext, totalTests = totalTests)
  
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
}


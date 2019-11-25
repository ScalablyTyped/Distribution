package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedDataForResultTrend extends js.Object {
  /**
    * This is tests execution duration.
    */
  var duration: js.Any
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  var testResultsContext: TestResultsContext
  var totalTests: Double
}

object AggregatedDataForResultTrend {
  @scala.inline
  def apply(
    duration: js.Any,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    testResultsContext: TestResultsContext,
    totalTests: Double
  ): AggregatedDataForResultTrend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
}


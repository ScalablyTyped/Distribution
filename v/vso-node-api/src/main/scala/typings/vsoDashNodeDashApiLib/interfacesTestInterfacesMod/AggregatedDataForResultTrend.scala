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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("resultsByOutcome")(resultsByOutcome)
    __obj.updateDynamic("testResultsContext")(testResultsContext)
    __obj.updateDynamic("totalTests")(totalTests)
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
}


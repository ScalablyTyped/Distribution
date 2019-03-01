package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsDetailsForGroup extends js.Object {
  var groupByValue: js.Any
  var results: js.Array[TestCaseResult]
  var resultsCountByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
}

object TestResultsDetailsForGroup {
  @scala.inline
  def apply(
    groupByValue: js.Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: org.scalablytyped.runtime.NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupByValue")(groupByValue)
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("resultsCountByOutcome")(resultsCountByOutcome)
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
}


package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResultsDetailsForGroup extends js.Object {
  var groupByValue: js.Any
  var results: js.Array[TestCaseResult]
  var resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
}

object TestResultsDetailsForGroup {
  @scala.inline
  def apply(
    groupByValue: js.Any,
    results: js.Array[TestCaseResult],
    resultsCountByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  ): TestResultsDetailsForGroup = {
    val __obj = js.Dynamic.literal(groupByValue = groupByValue, results = results, resultsCountByOutcome = resultsCountByOutcome)
  
    __obj.asInstanceOf[TestResultsDetailsForGroup]
  }
}


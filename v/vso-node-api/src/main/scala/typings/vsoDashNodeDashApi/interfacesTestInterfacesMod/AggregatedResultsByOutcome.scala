package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsByOutcome extends js.Object {
  var count: Double
  var duration: js.Any
  var groupByField: String
  var groupByValue: js.Any
  var outcome: TestOutcome
  var rerunResultCount: Double
}

object AggregatedResultsByOutcome {
  @scala.inline
  def apply(
    count: Double,
    duration: js.Any,
    groupByField: String,
    groupByValue: js.Any,
    outcome: TestOutcome,
    rerunResultCount: Double
  ): AggregatedResultsByOutcome = {
    val __obj = js.Dynamic.literal(count = count, duration = duration, groupByField = groupByField, groupByValue = groupByValue, outcome = outcome, rerunResultCount = rerunResultCount)
  
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
}


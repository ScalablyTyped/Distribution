package typings.vsoNodeApi.testInterfacesMod

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], groupByField = groupByField.asInstanceOf[js.Any], groupByValue = groupByValue.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], rerunResultCount = rerunResultCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
}


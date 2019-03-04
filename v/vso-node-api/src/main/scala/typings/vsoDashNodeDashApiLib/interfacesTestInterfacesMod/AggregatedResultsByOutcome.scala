package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsByOutcome extends js.Object {
  var count: scala.Double
  var duration: js.Any
  var groupByField: java.lang.String
  var groupByValue: js.Any
  var outcome: TestOutcome
  var rerunResultCount: scala.Double
}

object AggregatedResultsByOutcome {
  @scala.inline
  def apply(
    count: scala.Double,
    duration: js.Any,
    groupByField: java.lang.String,
    groupByValue: js.Any,
    outcome: TestOutcome,
    rerunResultCount: scala.Double
  ): AggregatedResultsByOutcome = {
    val __obj = js.Dynamic.literal(count = count, duration = duration, groupByField = groupByField, groupByValue = groupByValue, outcome = outcome, rerunResultCount = rerunResultCount)
  
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
}


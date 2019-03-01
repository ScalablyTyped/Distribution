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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("groupByField")(groupByField)
    __obj.updateDynamic("groupByValue")(groupByValue)
    __obj.updateDynamic("outcome")(outcome)
    __obj.updateDynamic("rerunResultCount")(rerunResultCount)
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunStatistic extends js.Object {
  var count: scala.Double
  var outcome: java.lang.String
  var resolutionState: TestResolutionState
  var state: java.lang.String
}

object RunStatistic {
  @scala.inline
  def apply(
    count: scala.Double,
    outcome: java.lang.String,
    resolutionState: TestResolutionState,
    state: java.lang.String
  ): RunStatistic = {
    val __obj = js.Dynamic.literal(count = count, outcome = outcome, resolutionState = resolutionState, state = state)
  
    __obj.asInstanceOf[RunStatistic]
  }
}


package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunStatistic extends js.Object {
  var count: Double
  var outcome: String
  var resolutionState: TestResolutionState
  var state: String
}

object RunStatistic {
  @scala.inline
  def apply(count: Double, outcome: String, resolutionState: TestResolutionState, state: String): RunStatistic = {
    val __obj = js.Dynamic.literal(count = count, outcome = outcome, resolutionState = resolutionState, state = state)
  
    __obj.asInstanceOf[RunStatistic]
  }
}


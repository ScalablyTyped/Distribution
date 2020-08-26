package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunStatistic extends js.Object {
  var count: Double = js.native
  var outcome: String = js.native
  var resolutionState: TestResolutionState = js.native
  var state: String = js.native
}

object RunStatistic {
  @scala.inline
  def apply(count: Double, outcome: String, resolutionState: TestResolutionState, state: String): RunStatistic = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunStatistic]
  }
  @scala.inline
  implicit class RunStatisticOps[Self <: RunStatistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutcome(value: String): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionState(value: TestResolutionState): Self = this.set("resolutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}


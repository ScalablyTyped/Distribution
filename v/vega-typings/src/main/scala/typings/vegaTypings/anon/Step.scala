package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeBand
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends _RangeBand {
  var step: Double | SignalRef = js.native
}

object Step {
  @scala.inline
  def apply(step: Double | SignalRef): Step = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
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
    def setStep(value: Double | SignalRef): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}


package typings.yadda.eventBusMod

import typings.yadda.contextMod.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepEventData extends js.Object {
  var ctx: Properties = js.native
  var step: String = js.native
}

object StepEventData {
  @scala.inline
  def apply(ctx: Properties, step: String): StepEventData = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEventData]
  }
  @scala.inline
  implicit class StepEventDataOps[Self <: StepEventData] (val x: Self) extends AnyVal {
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
    def setCtx(value: Properties): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: String): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}


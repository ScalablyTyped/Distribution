package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineTimeAxisOption extends js.Object {
  var scale: js.UndefOr[TimelineTimeAxisScaleType] = js.native
  var step: js.UndefOr[Double] = js.native
}

object TimelineTimeAxisOption {
  @scala.inline
  def apply(): TimelineTimeAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineTimeAxisOption]
  }
  @scala.inline
  implicit class TimelineTimeAxisOptionOps[Self <: TimelineTimeAxisOption] (val x: Self) extends AnyVal {
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
    def setScale(value: TimelineTimeAxisScaleType): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}


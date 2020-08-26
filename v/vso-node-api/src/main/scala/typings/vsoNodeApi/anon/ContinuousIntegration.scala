package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousIntegration extends js.Object {
  var continuousIntegration: scala.Double = js.native
  var manual: scala.Double = js.native
  var none: scala.Double = js.native
  var schedule: scala.Double = js.native
}

object ContinuousIntegration {
  @scala.inline
  def apply(
    continuousIntegration: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    schedule: scala.Double
  ): ContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousIntegration]
  }
  @scala.inline
  implicit class ContinuousIntegrationOps[Self <: ContinuousIntegration] (val x: Self) extends AnyVal {
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
    def setContinuousIntegration(value: scala.Double): Self = this.set("continuousIntegration", value.asInstanceOf[js.Any])
    @scala.inline
    def setManual(value: scala.Double): Self = this.set("manual", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: scala.Double): Self = this.set("schedule", value.asInstanceOf[js.Any])
  }
  
}


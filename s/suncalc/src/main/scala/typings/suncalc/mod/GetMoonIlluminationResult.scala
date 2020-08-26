package typings.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonIlluminationResult extends js.Object {
  var angle: Double = js.native
  var fraction: Double = js.native
  var phase: Double = js.native
}

object GetMoonIlluminationResult {
  @scala.inline
  def apply(angle: Double, fraction: Double, phase: Double): GetMoonIlluminationResult = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonIlluminationResult]
  }
  @scala.inline
  implicit class GetMoonIlluminationResultOps[Self <: GetMoonIlluminationResult] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhase(value: Double): Self = this.set("phase", value.asInstanceOf[js.Any])
  }
  
}


package typings.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonIlluminationResult extends js.Object {
  var angle: Double
  var fraction: Double
  var phase: Double
}

object GetMoonIlluminationResult {
  @scala.inline
  def apply(angle: Double, fraction: Double, phase: Double): GetMoonIlluminationResult = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonIlluminationResult]
  }
}


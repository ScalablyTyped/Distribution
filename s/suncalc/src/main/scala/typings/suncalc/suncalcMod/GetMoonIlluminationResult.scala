package typings.suncalc.suncalcMod

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
    val __obj = js.Dynamic.literal(angle = angle, fraction = fraction, phase = phase)
  
    __obj.asInstanceOf[GetMoonIlluminationResult]
  }
}


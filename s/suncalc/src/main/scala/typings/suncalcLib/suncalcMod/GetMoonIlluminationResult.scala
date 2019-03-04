package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMoonIlluminationResult extends js.Object {
  var angle: scala.Double
  var fraction: scala.Double
  var phase: scala.Double
}

object GetMoonIlluminationResult {
  @scala.inline
  def apply(angle: scala.Double, fraction: scala.Double, phase: scala.Double): GetMoonIlluminationResult = {
    val __obj = js.Dynamic.literal(angle = angle, fraction = fraction, phase = phase)
  
    __obj.asInstanceOf[GetMoonIlluminationResult]
  }
}


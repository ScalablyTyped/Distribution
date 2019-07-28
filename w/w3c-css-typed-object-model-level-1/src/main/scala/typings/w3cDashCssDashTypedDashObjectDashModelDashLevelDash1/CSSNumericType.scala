package typings.w3cDashCssDashTypedDashObjectDashModelDashLevelDash1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSNumericType extends js.Object {
  var angle: Double
  var flex: Double
  var frequency: Double
  var length: Double
  var percent: Double
  var percentHint: CSSNumericBaseType
  var resolution: Double
  var time: Double
}

object CSSNumericType {
  @scala.inline
  def apply(
    angle: Double,
    flex: Double,
    frequency: Double,
    length: Double,
    percent: Double,
    percentHint: CSSNumericBaseType,
    resolution: Double,
    time: Double
  ): CSSNumericType = {
    val __obj = js.Dynamic.literal(angle = angle, flex = flex, frequency = frequency, length = length, percent = percent, percentHint = percentHint, resolution = resolution, time = time)
  
    __obj.asInstanceOf[CSSNumericType]
  }
}


package typings
package w3cDashCssDashTypedDashObjectDashModelDashLevelDash1Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSNumericType extends js.Object {
  var angle: scala.Double
  var flex: scala.Double
  var frequency: scala.Double
  var length: scala.Double
  var percent: scala.Double
  var percentHint: CSSNumericBaseType
  var resolution: scala.Double
  var time: scala.Double
}

object CSSNumericType {
  @scala.inline
  def apply(
    angle: scala.Double,
    flex: scala.Double,
    frequency: scala.Double,
    length: scala.Double,
    percent: scala.Double,
    percentHint: CSSNumericBaseType,
    resolution: scala.Double,
    time: scala.Double
  ): CSSNumericType = {
    val __obj = js.Dynamic.literal(angle = angle, flex = flex, frequency = frequency, length = length, percent = percent, percentHint = percentHint, resolution = resolution, time = time)
  
    __obj.asInstanceOf[CSSNumericType]
  }
}


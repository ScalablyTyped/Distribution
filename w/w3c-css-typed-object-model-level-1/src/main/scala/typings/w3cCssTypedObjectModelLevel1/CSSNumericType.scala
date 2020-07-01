package typings.w3cCssTypedObjectModelLevel1

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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], percentHint = percentHint.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSNumericType]
  }
}


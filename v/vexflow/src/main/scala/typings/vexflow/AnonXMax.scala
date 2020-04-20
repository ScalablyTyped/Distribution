package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXMax extends js.Object {
  var xMax: Double
  var xMin: Double
  var yMax: Double
  var yMin: Double
}

object AnonXMax {
  @scala.inline
  def apply(xMax: Double, xMin: Double, yMax: Double, yMin: Double): AnonXMax = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXMax]
  }
}


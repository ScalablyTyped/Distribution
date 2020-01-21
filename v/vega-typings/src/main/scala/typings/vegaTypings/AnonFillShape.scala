package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillShape extends js.Object {
  var fill: String
  var shape: String
  var size: Double
  var strokeWidth: Double
}

object AnonFillShape {
  @scala.inline
  def apply(fill: String, shape: String, size: Double, strokeWidth: Double): AnonFillShape = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFillShape]
  }
}


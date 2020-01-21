package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  var opacity: Double
  var stroke: String
  var strokeWidth: Double
  var x2: Double
  var y2: Double
}

object AnonOpacity {
  @scala.inline
  def apply(opacity: Double, stroke: String, strokeWidth: Double, x2: Double, y2: Double): AnonOpacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpacity]
  }
}


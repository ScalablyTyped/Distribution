package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFill extends js.Object {
  var fill: Double
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object AnonFill {
  @scala.inline
  def apply(fill: Double, height: Double, width: Double, x: Double, y: Double): AnonFill = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFill]
  }
}


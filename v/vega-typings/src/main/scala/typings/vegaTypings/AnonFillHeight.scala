package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFillHeight extends js.Object {
  var fill: String
  var height: Double
  var width: Double
}

object AnonFillHeight {
  @scala.inline
  def apply(fill: String, height: Double, width: Double): AnonFillHeight = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFillHeight]
  }
}


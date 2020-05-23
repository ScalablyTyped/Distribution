package typings.tooltipster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bottom extends js.Object {
  /** this is the distance between the bottom side of the origin and the top of the viewport */
  var bottom: Double
  var left: Double
  /** this is the distance between the right side of the origin and the left of the viewport */
  var right: Double
  var top: Double
}

object Bottom {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
}


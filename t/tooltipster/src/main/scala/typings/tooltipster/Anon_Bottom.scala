package typings.tooltipster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /** this is the distance between the bottom side of the origin and the top of the viewport */
  var bottom: Double
  var left: Double
  /** this is the distance between the right side of the origin and the left of the viewport */
  var right: Double
  var top: Double
}

object Anon_Bottom {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Anon_Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}


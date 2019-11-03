package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intersection extends js.Object {
  var points: js.Array[Point2D]
  var status: String
}

object Intersection {
  @scala.inline
  def apply(points: js.Array[Point2D], status: String): Intersection = {
    val __obj = js.Dynamic.literal(points = points, status = status)
  
    __obj.asInstanceOf[Intersection]
  }
}


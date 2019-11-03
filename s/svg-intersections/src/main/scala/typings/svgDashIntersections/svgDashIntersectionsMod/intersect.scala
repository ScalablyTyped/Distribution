package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("svg-intersections", "intersect")
@js.native
object intersect extends js.Object {
  def apply(shape1: Shape, shape2: Shape): Intersection = js.native
  def apply(shape1: Shape, shape2: Shape, m1: Matrix2D): Intersection = js.native
  def apply(shape1: Shape, shape2: Shape, m1: Matrix2D, m2: Matrix2D): Intersection = js.native
}


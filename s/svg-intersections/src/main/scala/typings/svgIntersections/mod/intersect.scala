package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("svg-intersections", "intersect")
@js.native
object intersect extends js.Object {
  
  def apply(shape1: Shape_, shape2: Shape_): Intersection = js.native
  def apply(shape1: Shape_, shape2: Shape_, m1: js.UndefOr[scala.Nothing], m2: Matrix2D): Intersection = js.native
  def apply(shape1: Shape_, shape2: Shape_, m1: Matrix2D): Intersection = js.native
  def apply(shape1: Shape_, shape2: Shape_, m1: Matrix2D, m2: Matrix2D): Intersection = js.native
}

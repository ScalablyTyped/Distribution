package typings.svgDotJs.svgDotJsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.SVGPoint
import typings.svgDotJs.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point
  extends Instantiable0[Point]
     with Instantiable2[/* x */ Double, /* y */ Double, Point]
     with Instantiable1[(/* position */ Anon_X) | (/* position */ ArrayPoint) | (/* point */ Point), Point] {
  var x: Double = js.native
  var y: Double = js.native
  def at(pos: Double): Point = js.native
  def morph(point: Point): this.type = js.native
  def native(): SVGPoint = js.native
  def transform(matrix: Matrix): Point = js.native
}


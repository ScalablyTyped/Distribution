package typings
package svgDotJsLib.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point
  extends org.scalablytyped.runtime.Instantiable0[Point]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, Point]
     with org.scalablytyped.runtime.Instantiable1[
      (/* position */ svgDotJsLib.Anon_X) | (/* position */ ArrayPoint) | (/* point */ Point), 
      Point
    ] {
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def at(pos: scala.Double): Point = js.native
  def morph(point: Point): this.type = js.native
  def native(): stdLib.SVGPoint = js.native
  def transform(matrix: Matrix): Point = js.native
}


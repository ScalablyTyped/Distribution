package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matrix2D extends js.Object {
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var f: Double
}

object Matrix2D {
  @scala.inline
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix2D = {
    val __obj = js.Dynamic.literal(a = a, b = b, c = c, d = d, e = e, f = f)
  
    __obj.asInstanceOf[Matrix2D]
  }
}


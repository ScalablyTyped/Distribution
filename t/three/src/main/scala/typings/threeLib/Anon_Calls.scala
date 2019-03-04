package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calls extends js.Object {
  var calls: scala.Double
  var frame: scala.Double
  var lines: scala.Double
  var points: scala.Double
  var triangles: scala.Double
}

object Anon_Calls {
  @scala.inline
  def apply(
    calls: scala.Double,
    frame: scala.Double,
    lines: scala.Double,
    points: scala.Double,
    triangles: scala.Double
  ): Anon_Calls = {
    val __obj = js.Dynamic.literal(calls = calls, frame = frame, lines = lines, points = points, triangles = triangles)
  
    __obj.asInstanceOf[Anon_Calls]
  }
}


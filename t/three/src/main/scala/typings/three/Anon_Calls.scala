package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calls extends js.Object {
  var calls: Double
  var frame: Double
  var lines: Double
  var points: Double
  var triangles: Double
}

object Anon_Calls {
  @scala.inline
  def apply(calls: Double, frame: Double, lines: Double, points: Double, triangles: Double): Anon_Calls = {
    val __obj = js.Dynamic.literal(calls = calls, frame = frame, lines = lines, points = points, triangles = triangles)
  
    __obj.asInstanceOf[Anon_Calls]
  }
}


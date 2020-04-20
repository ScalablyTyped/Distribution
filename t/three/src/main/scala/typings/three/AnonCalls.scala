package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCalls extends js.Object {
  var calls: Double
  var frame: Double
  var lines: Double
  var points: Double
  var triangles: Double
}

object AnonCalls {
  @scala.inline
  def apply(calls: Double, frame: Double, lines: Double, points: Double, triangles: Double): AnonCalls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalls]
  }
}


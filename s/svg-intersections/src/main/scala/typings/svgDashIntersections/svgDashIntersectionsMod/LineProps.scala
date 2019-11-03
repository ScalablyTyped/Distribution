package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps
  extends _SvgProperties[js.Any] {
  var x1: Double
  var x2: Double
  var y1: Double
  var y2: Double
}

object LineProps {
  @scala.inline
  def apply(x1: Double, x2: Double, y1: Double, y2: Double): LineProps = {
    val __obj = js.Dynamic.literal(x1 = x1, x2 = x2, y1 = y1, y2 = y2)
  
    __obj.asInstanceOf[LineProps]
  }
}


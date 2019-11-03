package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipseProps
  extends _SvgProperties[js.Any] {
  var cx: Double
  var cy: Double
  var rx: Double
  var ry: Double
}

object EllipseProps {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double): EllipseProps = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, rx = rx, ry = ry)
  
    __obj.asInstanceOf[EllipseProps]
  }
}


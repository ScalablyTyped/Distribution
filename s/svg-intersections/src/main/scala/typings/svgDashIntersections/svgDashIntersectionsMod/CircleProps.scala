package typings.svgDashIntersections.svgDashIntersectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleProps
  extends _SvgProperties[js.Any] {
  var cx: Double
  var cy: Double
  var r: Double
}

object CircleProps {
  @scala.inline
  def apply(cx: Double, cy: Double, r: Double): CircleProps = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, r = r)
  
    __obj.asInstanceOf[CircleProps]
  }
}


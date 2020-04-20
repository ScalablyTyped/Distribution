package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonProps
  extends _SvgProperties[js.Any] {
  var points: String
}

object PolygonProps {
  @scala.inline
  def apply(points: String): PolygonProps = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonProps]
  }
}


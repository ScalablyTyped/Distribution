package typings.svgDashIntersections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashIntersectionsMod {
  type PolylineProps = PolygonProps
  /* Rewritten from type alias, can be one of: 
    - typings.svgDashIntersections.svgDashIntersectionsMod.PathProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.PolylineProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.PolygonProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.EllipseProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.CircleProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.RectProps
    - typings.svgDashIntersections.svgDashIntersectionsMod.LineProps
  */
  type SvgProperties[T /* <: SvgElements */] = _SvgProperties[T] | PolylineProps
}

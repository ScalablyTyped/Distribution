package typings.svgIntersections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PolylineProps = typings.svgIntersections.mod.PolygonProps
  /* Rewritten from type alias, can be one of: 
    - typings.svgIntersections.mod.PathProps
    - typings.svgIntersections.mod.PolylineProps
    - typings.svgIntersections.mod.PolygonProps
    - typings.svgIntersections.mod.EllipseProps
    - typings.svgIntersections.mod.CircleProps
    - typings.svgIntersections.mod.RectProps
    - typings.svgIntersections.mod.LineProps
  */
  type SvgProperties[T /* <: typings.svgIntersections.mod.SvgElements */] = typings.svgIntersections.mod._SvgProperties[T] | typings.svgIntersections.mod.PolylineProps
}

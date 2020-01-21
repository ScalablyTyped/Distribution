package typings.svgIntersections.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.svgIntersections.svgIntersectionsStrings.line
  - typings.svgIntersections.svgIntersectionsStrings.rect
  - typings.svgIntersections.svgIntersectionsStrings.circle
  - typings.svgIntersections.svgIntersectionsStrings.ellipse
  - typings.svgIntersections.svgIntersectionsStrings.polygon
  - typings.svgIntersections.svgIntersectionsStrings.polyline
  - typings.svgIntersections.svgIntersectionsStrings.path
*/
trait SvgElements extends js.Object

object SvgElements {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.svgIntersections.svgIntersectionsStrings.circle = this.cast("circle")
  @scala.inline
  def ellipse: typings.svgIntersections.svgIntersectionsStrings.ellipse = this.cast("ellipse")
  @scala.inline
  def line: typings.svgIntersections.svgIntersectionsStrings.line = this.cast("line")
  @scala.inline
  def path: typings.svgIntersections.svgIntersectionsStrings.path = this.cast("path")
  @scala.inline
  def polygon: typings.svgIntersections.svgIntersectionsStrings.polygon = this.cast("polygon")
  @scala.inline
  def polyline: typings.svgIntersections.svgIntersectionsStrings.polyline = this.cast("polyline")
  @scala.inline
  def rect: typings.svgIntersections.svgIntersectionsStrings.rect = this.cast("rect")
}


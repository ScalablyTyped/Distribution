package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGCircleElement
import typings.std.SVGGElement
import typings.std.SVGPathElement
import typings.std.SVGPolygonElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/primitives/svg", JSImport.Namespace)
@js.native
object svgMod extends js.Object {
  val Circle: ComponentType[SVGProps[SVGCircleElement]] = js.native
  val G: ComponentType[SVGProps[SVGGElement]] = js.native
  val Path: ComponentType[SVGProps[SVGPathElement]] = js.native
  val Polygon: ComponentType[SVGProps[SVGPolygonElement]] = js.native
  val Rect: ComponentType[SVGProps[SVGRectElement]] = js.native
  val SVG: ComponentType[SVGProps[SVGSVGElement]] = js.native
}


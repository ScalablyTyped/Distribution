package typings.wordpressComponents

import typings.react.mod.ComponentType
import typings.react.mod.SVGProps
import typings.std.SVGCircleElement
import typings.std.SVGGElement
import typings.std.SVGPathElement
import typings.std.SVGPolygonElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import typings.wordpressComponents.wordpressComponentsStrings.blockquote
import typings.wordpressComponents.wordpressComponentsStrings.hr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/primitives", JSImport.Namespace)
@js.native
object primitivesMod extends js.Object {
  
  val BlockQuotation: blockquote = js.native
  
  val Circle: ComponentType[SVGProps[SVGCircleElement]] = js.native
  
  val G: ComponentType[SVGProps[SVGGElement]] = js.native
  
  val HorizontalRule: hr = js.native
  
  val Path: ComponentType[SVGProps[SVGPathElement]] = js.native
  
  val Polygon: ComponentType[SVGProps[SVGPolygonElement]] = js.native
  
  val Rect: ComponentType[SVGProps[SVGRectElement]] = js.native
  
  val SVG: ComponentType[SVGProps[SVGSVGElement]] = js.native
}

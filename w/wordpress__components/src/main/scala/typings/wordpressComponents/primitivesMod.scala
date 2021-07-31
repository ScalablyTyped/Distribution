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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesMod {
  
  @JSImport("@wordpress/components/primitives", "BlockQuotation")
  @js.native
  val BlockQuotation: blockquote = js.native
  
  @JSImport("@wordpress/components/primitives", "Circle")
  @js.native
  val Circle: ComponentType[SVGProps[SVGCircleElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "G")
  @js.native
  val G: ComponentType[SVGProps[SVGGElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "HorizontalRule")
  @js.native
  val HorizontalRule: hr = js.native
  
  @JSImport("@wordpress/components/primitives", "Path")
  @js.native
  val Path: ComponentType[SVGProps[SVGPathElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Polygon")
  @js.native
  val Polygon: ComponentType[SVGProps[SVGPolygonElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Rect")
  @js.native
  val Rect: ComponentType[SVGProps[SVGRectElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "SVG")
  @js.native
  val SVG: ComponentType[SVGProps[SVGSVGElement]] = js.native
}

package typings.stylefire

import typings.std.SVGElement
import typings.std.SVGPathElement
import typings.stylefire.svgTypesMod.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgUtilsMod {
  
  @JSImport("stylefire/lib/svg/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDimensions(element: SVGElement): Dimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Dimensions]
  inline def getDimensions(element: SVGPathElement): Dimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Dimensions]
  
  inline def getSVGElementDimensions(element: SVGElement): Dimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Dimensions]
  inline def getSVGElementDimensions(element: SVGPathElement): Dimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGElementDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[Dimensions]
}

package typings.stylefire

import typings.std.SVGElement
import typings.std.SVGPathElement
import typings.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  @JSImport("stylefire/lib/svg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: SVGElement): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Styler]
  @scala.inline
  def default(element: SVGPathElement): Styler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Styler]
}

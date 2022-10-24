package typings.wixStyleReact

import typings.color.mod.Color
import typings.color.mod.ColorParam
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillPreviewUtilsMod {
  
  @JSImport("wix-style-react/dist/types/FillPreview/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseColor(fill: Any): js.UndefOr[Color[ColorParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Color[ColorParam]]]
  
  inline def parseElement(fill: Any): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseElement")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReactElement]]
  
  inline def parseGradient(fill: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradient")(fill.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseUrl(fill: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}

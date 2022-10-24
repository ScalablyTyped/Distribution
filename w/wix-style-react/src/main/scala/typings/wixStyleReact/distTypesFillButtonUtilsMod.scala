package typings.wixStyleReact

import typings.color.mod.Color
import typings.color.mod.ColorParam
import typings.wixStyleReact.wixStyleReactStrings.Numbersign162d3d
import typings.wixStyleReact.wixStyleReactStrings.Numbersignffffff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillButtonUtilsMod {
  
  @JSImport("wix-style-react/dist/types/FillButton/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseColor(fill: Any): js.UndefOr[Color[ColorParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Color[ColorParam]]]
  
  inline def parseContrastColor(fill: Any): js.UndefOr[Numbersignffffff | Numbersign162d3d] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContrastColor")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Numbersignffffff | Numbersign162d3d]]
  
  inline def parseGradient(fill: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradient")(fill.asInstanceOf[js.Any]).asInstanceOf[Any]
}

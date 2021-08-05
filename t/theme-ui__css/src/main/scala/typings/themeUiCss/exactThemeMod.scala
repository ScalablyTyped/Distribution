package typings.themeUiCss

import typings.themeUiCss.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exactThemeMod {
  
  @JSImport("@theme-ui/css/dist/exact-theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTheme[T /* <: Theme */](t: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTheme")(t.asInstanceOf[js.Any]).asInstanceOf[T]
}

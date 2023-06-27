package typings.themeUiThemeProvider

import typings.react.mod.FC
import typings.react.mod.JSX.Element
import typings.themeUiThemeProvider.distDeclarationsSrcMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeUiThemeProviderDotcjsMod {
  
  @JSImport("@theme-ui/theme-provider/dist/theme-ui-theme-provider.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/theme-provider/dist/theme-ui-theme-provider.cjs", "ThemeProvider")
  @js.native
  val ThemeProvider: FC[ThemeProviderProps] = js.native
  
  inline def ThemeUIProvider(param0: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeUIProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}

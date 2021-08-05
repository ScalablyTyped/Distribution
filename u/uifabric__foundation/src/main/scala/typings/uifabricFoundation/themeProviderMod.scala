package typings.uifabricFoundation

import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@uifabric/foundation/lib/ThemeProvider", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  
  trait IThemeProviderProps extends StObject {
    
    var scheme: js.UndefOr[ISchemeNames] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IThemeProviderProps {
    
    inline def apply(): IThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeProviderProps]
    }
    
    extension [Self <: IThemeProviderProps](x: Self) {
      
      inline def setScheme(value: ISchemeNames): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}

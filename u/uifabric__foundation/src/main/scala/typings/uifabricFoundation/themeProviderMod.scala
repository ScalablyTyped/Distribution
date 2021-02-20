package typings.uifabricFoundation

import typings.fluentuiTheme.ischemeMod.ISchemeNames
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("@uifabric/foundation/lib/ThemeProvider", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  
  @js.native
  trait IThemeProviderProps extends StObject {
    
    var scheme: js.UndefOr[ISchemeNames] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IThemeProviderProps {
    
    @scala.inline
    def apply(): IThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeProviderProps]
    }
    
    @scala.inline
    implicit class IThemeProviderPropsMutableBuilder[Self <: IThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheme(value: ISchemeNames): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}

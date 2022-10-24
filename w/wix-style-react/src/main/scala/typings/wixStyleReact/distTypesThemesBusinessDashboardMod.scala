package typings.wixStyleReact

import typings.wixStyleReact.distTypesThemeProviderMod.ThemeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThemesBusinessDashboardMod {
  
  @JSImport("wix-style-react/dist/types/Themes/businessDashboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def theme(): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")().asInstanceOf[ThemeInterface]
  inline def theme(options: ThemeOptions): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(options.asInstanceOf[js.Any]).asInstanceOf[ThemeInterface]
  
  trait ThemeOptions extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object ThemeOptions {
    
    inline def apply(): ThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeOptions]
    }
    
    extension [Self <: ThemeOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
}

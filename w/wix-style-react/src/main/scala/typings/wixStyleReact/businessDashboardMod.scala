package typings.wixStyleReact

import typings.wixStyleReact.themeProviderMod.ThemeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object businessDashboardMod {
  
  @JSImport("wix-style-react/dist/es/src/Themes/businessDashboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def theme(): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")().asInstanceOf[ThemeInterface]
  @scala.inline
  def theme(options: ThemeOptions): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(options.asInstanceOf[js.Any]).asInstanceOf[ThemeInterface]
  
  trait ThemeOptions extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object ThemeOptions {
    
    @scala.inline
    def apply(): ThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeOptions]
    }
    
    @scala.inline
    implicit class ThemeOptionsMutableBuilder[Self <: ThemeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
}

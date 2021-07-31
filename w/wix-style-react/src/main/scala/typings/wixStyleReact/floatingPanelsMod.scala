package typings.wixStyleReact

import typings.wixStyleReact.themeProviderMod.ThemeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingPanelsMod {
  
  @JSImport("wix-style-react/dist/es/src/Themes/floatingPanels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def theme(FloatingPanelsProps: FloatingPanelsProps): ThemeInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(FloatingPanelsProps.asInstanceOf[js.Any]).asInstanceOf[ThemeInterface]
  
  trait FloatingPanelsProps
    extends StObject
       with ThemeInterface {
    
    var mainColor: js.UndefOr[String] = js.undefined
  }
  object FloatingPanelsProps {
    
    @scala.inline
    def apply(): FloatingPanelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatingPanelsProps]
    }
    
    @scala.inline
    implicit class FloatingPanelsPropsMutableBuilder[Self <: FloatingPanelsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMainColor(value: String): Self = StObject.set(x, "mainColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainColorUndefined: Self = StObject.set(x, "mainColor", js.undefined)
    }
  }
}

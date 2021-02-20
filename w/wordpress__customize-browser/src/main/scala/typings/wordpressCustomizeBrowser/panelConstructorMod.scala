package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.themesPanelMod.ThemesPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelConstructorMod {
  
  @js.native
  trait PanelConstructor extends StObject {
    
    var themes: ThemesPanel = js.native
  }
  object PanelConstructor {
    
    @scala.inline
    def apply(themes: ThemesPanel): PanelConstructor = {
      val __obj = js.Dynamic.literal(themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelConstructor]
    }
    
    @scala.inline
    implicit class PanelConstructorMutableBuilder[Self <: PanelConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThemes(value: ThemesPanel): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    }
  }
}

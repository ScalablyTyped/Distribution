package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.themesPanelMod.ThemesPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelConstructorMod {
  
  trait PanelConstructor extends StObject {
    
    var themes: ThemesPanel
  }
  object PanelConstructor {
    
    inline def apply(themes: ThemesPanel): PanelConstructor = {
      val __obj = js.Dynamic.literal(themes = themes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelConstructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelConstructor] (val x: Self) extends AnyVal {
      
      inline def setThemes(value: ThemesPanel): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    }
  }
}

package typings.vscodeTextmate

import typings.vscodeTextmate.mod.Registry
import typings.vscodeTextmate.releaseThemeMod.IRawTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseTestsThemesDottestMod {
  
  trait ThemeData extends StObject {
    
    var registry: Registry
    
    var theme: IRawTheme
    
    var themeName: String
  }
  object ThemeData {
    
    inline def apply(registry: Registry, theme: IRawTheme, themeName: String): ThemeData = {
      val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeName = themeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeData] (val x: Self) extends AnyVal {
      
      inline def setRegistry(value: Registry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IRawTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeName(value: String): Self = StObject.set(x, "themeName", value.asInstanceOf[js.Any])
    }
  }
}

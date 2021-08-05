package typings.themeUiCss

import typings.themeUiCss.mod.CssPropsArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Theme
    extends StObject
       with CssPropsArgument {
    
    var theme: typings.themeUiCss.typesMod.Theme
  }
  object Theme {
    
    inline def apply(theme: typings.themeUiCss.typesMod.Theme): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: typings.themeUiCss.typesMod.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}

package typings.themeUi.mod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeUIContext extends StObject {
  
  var colorMode: String
  
  var setColorMode: Dispatch[SetStateAction[String]]
  
  var theme: Theme
}
object ThemeUIContext {
  
  inline def apply(colorMode: String, setColorMode: SetStateAction[String] => Unit, theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], setColorMode = js.Any.fromFunction1(setColorMode), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUIContext]
  }
  
  extension [Self <: ThemeUIContext](x: Self) {
    
    inline def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setSetColorMode(value: SetStateAction[String] => Unit): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1(value))
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}

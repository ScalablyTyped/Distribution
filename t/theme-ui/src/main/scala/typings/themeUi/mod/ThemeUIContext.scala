package typings.themeUi.mod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeUIContext extends StObject {
  
  var colorMode: String = js.native
  
  var setColorMode: Dispatch[SetStateAction[String]] = js.native
  
  var theme: Theme = js.native
}
object ThemeUIContext {
  
  @scala.inline
  def apply(colorMode: String, setColorMode: SetStateAction[String] => Unit, theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], setColorMode = js.Any.fromFunction1(setColorMode), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeUIContext]
  }
  
  @scala.inline
  implicit class ThemeUIContextMutableBuilder[Self <: ThemeUIContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetColorMode(value: SetStateAction[String] => Unit): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}

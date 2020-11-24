package typings.themeUi.mod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeUIContext extends js.Object {
  
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
  implicit class ThemeUIContextOps[Self <: ThemeUIContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorMode(value: String): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetColorMode(value: SetStateAction[String] => Unit): Self = this.set("setColorMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}

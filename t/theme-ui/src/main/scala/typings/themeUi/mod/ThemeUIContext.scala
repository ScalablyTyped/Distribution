package typings.themeUi.mod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeUIContext extends js.Object {
  var colorMode: String
  var setColorMode: Dispatch[SetStateAction[String]]
  var theme: Theme
}

object ThemeUIContext {
  @scala.inline
  def apply(colorMode: String, setColorMode: SetStateAction[String] => Unit, theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(colorMode = colorMode.asInstanceOf[js.Any], setColorMode = js.Any.fromFunction1(setColorMode), theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeUIContext]
  }
}


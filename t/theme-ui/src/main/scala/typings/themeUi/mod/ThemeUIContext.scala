package typings.themeUi.mod

import typings.themeUi.PinkeyofIntrinsicSxElemen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeUIContext extends js.Object {
  var components: PinkeyofIntrinsicSxElemen
  var theme: Theme
}

object ThemeUIContext {
  @scala.inline
  def apply(components: PinkeyofIntrinsicSxElemen, theme: Theme): ThemeUIContext = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeUIContext]
  }
}


package typings.theming.themingMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
  var theme: Theme
}

object ThemeProviderProps {
  @scala.inline
  def apply(theme: Theme, children: ReactElement = null): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[ThemeProviderProps]
  }
}


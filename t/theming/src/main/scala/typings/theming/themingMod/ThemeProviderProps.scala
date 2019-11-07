package typings.theming.themingMod

import typings.react.reactMod.ReactNode
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[Theme] extends js.Object {
  var children: ReactNode
  var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](
    theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]]),
    children: ReactNode = null
  ): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
}


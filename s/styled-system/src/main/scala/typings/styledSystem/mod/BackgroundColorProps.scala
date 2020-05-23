package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  var backgroundColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BackgroundColorProps {
  @scala.inline
  def apply[ThemeType, TVal](
    backgroundColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    bg: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined
  ): BackgroundColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorProps[ThemeType, TVal]]
  }
}


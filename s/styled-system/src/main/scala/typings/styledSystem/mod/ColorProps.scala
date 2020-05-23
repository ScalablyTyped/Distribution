package typings.styledSystem.mod

import typings.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends TextColorProps[ThemeType, TVal]
     with BackgroundColorProps[ThemeType, TVal]
     with OpacityProps[RequiredTheme]

object ColorProps {
  @scala.inline
  def apply[ThemeType, TVal](
    backgroundColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    bg: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    color: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    opacity: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, RequiredTheme])] = js.undefined
  ): ColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColor)) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bg)) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps[ThemeType, TVal]]
  }
}


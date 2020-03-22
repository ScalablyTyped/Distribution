package typings.styledSystem.mod

import typings.csstype.mod.OpacityProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends TextColorProps[ThemeType, TVal]
     with BackgroundColorProps[ThemeType, TVal]
     with OpacityProps[RequiredTheme]

object ColorProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](
    backgroundColor: ResponsiveValue[TVal, ThemeType] = null,
    bg: ResponsiveValue[TVal, ThemeType] = null,
    color: ResponsiveValue[TVal, ThemeType] = null,
    opacity: ResponsiveValue[OpacityProperty, RequiredTheme] = null
  ): ColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps[ThemeType, TVal]]
  }
}


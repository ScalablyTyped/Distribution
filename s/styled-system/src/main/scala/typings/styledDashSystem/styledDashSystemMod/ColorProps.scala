package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BackgroundProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps
  extends TextColorProps
     with BackgroundColorProps[TLengthStyledSystem]
     with OpacityProps

object ColorProps {
  @scala.inline
  def apply(
    backgroundColor: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    bg: ResponsiveValue[BackgroundProperty[TLengthStyledSystem]] = null,
    color: ResponsiveValue[ColorProperty] = null,
    opacity: ResponsiveValue[GlobalsNumber] = null
  ): ColorProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps]
  }
}


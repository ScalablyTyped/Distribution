package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorProps
  extends TextColorProps
     with BgColorProps[TLengthStyledSystem]

object ColorProps {
  @scala.inline
  def apply(
    bg: ResponsiveValue[csstypeLib.csstypeMod.BackgroundProperty[TLengthStyledSystem]] = null,
    color: ResponsiveValue[csstypeLib.csstypeMod.ColorProperty] = null
  ): ColorProps = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps]
  }
}


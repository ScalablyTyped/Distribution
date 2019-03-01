package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTheme extends js.Object {
  var breakpoints: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double] | js.Object] = js.undefined
  var colors: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.ColorProperty]] = js.undefined
  var fontSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var space: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object BaseTheme {
  @scala.inline
  def apply(
    breakpoints: js.Array[java.lang.String] | js.Array[scala.Double] | js.Object = null,
    colors: ObjectOrArray[csstypeLib.csstypeMod.ColorProperty] = null,
    fontSizes: js.Array[scala.Double] = null,
    space: js.Array[scala.Double] = null
  ): BaseTheme = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[BaseTheme]
  }
}


package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTheme extends js.Object {
  var breakpoints: js.UndefOr[(js.Array[scala.Double | java.lang.String]) | js.Object] = js.undefined
  var colors: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.ColorProperty]] = js.undefined
  var fontSizes: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontSizeProperty[scala.Double]]] = js.undefined
  var space: js.UndefOr[ObjectOrArray[scala.Double | java.lang.String]] = js.undefined
}

object BaseTheme {
  @scala.inline
  def apply(
    breakpoints: (js.Array[scala.Double | java.lang.String]) | js.Object = null,
    colors: ObjectOrArray[csstypeLib.csstypeMod.ColorProperty] = null,
    fontSizes: ObjectOrArray[csstypeLib.csstypeMod.FontSizeProperty[scala.Double]] = null,
    space: ObjectOrArray[scala.Double | java.lang.String] = null
  ): BaseTheme = {
    val __obj = js.Dynamic.literal()
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTheme]
  }
}


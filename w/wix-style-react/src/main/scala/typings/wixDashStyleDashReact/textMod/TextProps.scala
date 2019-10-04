package typings.wixDashStyleDashReact.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var ellipsed: js.UndefOr[Boolean] = js.undefined
  var light: js.UndefOr[Boolean] = js.undefined
  var secondary: js.UndefOr[Boolean] = js.undefined
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[TextSize] = js.undefined
  var skin: js.UndefOr[TextSkin] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[TextWeight] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    className: String = null,
    ellipsed: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    size: TextSize = null,
    skin: TextSkin = null,
    tagName: String = null,
    weight: TextWeight = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(ellipsed)) __obj.updateDynamic("ellipsed")(ellipsed)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (size != null) __obj.updateDynamic("size")(size)
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[TextProps]
  }
}


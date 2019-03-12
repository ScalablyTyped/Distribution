package typings
package terminalDashKitLib.screenBufferMod.ScreenBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var bgColor: js.UndefOr[scala.Double] = js.undefined
  var bgDefaultColor: js.UndefOr[scala.Boolean] = js.undefined
  var bgTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var blink: js.UndefOr[scala.Boolean] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var charTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[scala.Double] = js.undefined
  var defaultColor: js.UndefOr[scala.Boolean] = js.undefined
  var dim: js.UndefOr[scala.Boolean] = js.undefined
  var fgTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var strike: js.UndefOr[scala.Boolean] = js.undefined
  var styleTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    bgColor: scala.Int | scala.Double = null,
    bgDefaultColor: js.UndefOr[scala.Boolean] = js.undefined,
    bgTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    blink: js.UndefOr[scala.Boolean] = js.undefined,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    charTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    color: scala.Int | scala.Double = null,
    defaultColor: js.UndefOr[scala.Boolean] = js.undefined,
    dim: js.UndefOr[scala.Boolean] = js.undefined,
    fgTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    strike: js.UndefOr[scala.Boolean] = js.undefined,
    styleTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bgDefaultColor)) __obj.updateDynamic("bgDefaultColor")(bgDefaultColor)
    if (!js.isUndefined(bgTransparency)) __obj.updateDynamic("bgTransparency")(bgTransparency)
    if (!js.isUndefined(blink)) __obj.updateDynamic("blink")(blink)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(charTransparency)) __obj.updateDynamic("charTransparency")(charTransparency)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultColor)) __obj.updateDynamic("defaultColor")(defaultColor)
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim)
    if (!js.isUndefined(fgTransparency)) __obj.updateDynamic("fgTransparency")(fgTransparency)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike)
    if (!js.isUndefined(styleTransparency)) __obj.updateDynamic("styleTransparency")(styleTransparency)
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[Attributes]
  }
}


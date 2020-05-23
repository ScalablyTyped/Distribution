package typings.terminalKit.screenBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var bgColor: js.UndefOr[Double] = js.undefined
  var bgDefaultColor: js.UndefOr[Boolean] = js.undefined
  var bgTransparency: js.UndefOr[Boolean] = js.undefined
  var blink: js.UndefOr[Boolean] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var charTransparency: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  var defaultColor: js.UndefOr[Boolean] = js.undefined
  var dim: js.UndefOr[Boolean] = js.undefined
  var fgTransparency: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var strike: js.UndefOr[Boolean] = js.undefined
  var styleTransparency: js.UndefOr[Boolean] = js.undefined
  var transparency: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    bgColor: js.UndefOr[Double] = js.undefined,
    bgDefaultColor: js.UndefOr[Boolean] = js.undefined,
    bgTransparency: js.UndefOr[Boolean] = js.undefined,
    blink: js.UndefOr[Boolean] = js.undefined,
    bold: js.UndefOr[Boolean] = js.undefined,
    charTransparency: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Double] = js.undefined,
    defaultColor: js.UndefOr[Boolean] = js.undefined,
    dim: js.UndefOr[Boolean] = js.undefined,
    fgTransparency: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    strike: js.UndefOr[Boolean] = js.undefined,
    styleTransparency: js.UndefOr[Boolean] = js.undefined,
    transparency: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bgColor)) __obj.updateDynamic("bgColor")(bgColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bgDefaultColor)) __obj.updateDynamic("bgDefaultColor")(bgDefaultColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bgTransparency)) __obj.updateDynamic("bgTransparency")(bgTransparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blink)) __obj.updateDynamic("blink")(blink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charTransparency)) __obj.updateDynamic("charTransparency")(charTransparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultColor)) __obj.updateDynamic("defaultColor")(defaultColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fgTransparency)) __obj.updateDynamic("fgTransparency")(fgTransparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike.get.asInstanceOf[js.Any])
    if (!js.isUndefined(styleTransparency)) __obj.updateDynamic("styleTransparency")(styleTransparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}


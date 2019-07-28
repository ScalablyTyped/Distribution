package typings.terminalDashKit.screenBufferHDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var b: Double
  var bgA: js.UndefOr[Double] = js.undefined
  var bgB: Double
  var bgDefaultColor: js.UndefOr[Boolean] = js.undefined
  var bgG: Double
  var bgR: Double
  var blink: js.UndefOr[Boolean] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var charTransparency: js.UndefOr[Boolean] = js.undefined
  var defaultColor: js.UndefOr[Boolean] = js.undefined
  var dim: js.UndefOr[Boolean] = js.undefined
  var g: Double
  var hidden: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var r: Double
  var strike: js.UndefOr[Boolean] = js.undefined
  var styleTransparency: js.UndefOr[Boolean] = js.undefined
  var transparency: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    b: Double,
    bgB: Double,
    bgG: Double,
    bgR: Double,
    g: Double,
    r: Double,
    a: Int | Double = null,
    bgA: Int | Double = null,
    bgDefaultColor: js.UndefOr[Boolean] = js.undefined,
    blink: js.UndefOr[Boolean] = js.undefined,
    bold: js.UndefOr[Boolean] = js.undefined,
    charTransparency: js.UndefOr[Boolean] = js.undefined,
    defaultColor: js.UndefOr[Boolean] = js.undefined,
    dim: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    strike: js.UndefOr[Boolean] = js.undefined,
    styleTransparency: js.UndefOr[Boolean] = js.undefined,
    transparency: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal(b = b, bgB = bgB, bgG = bgG, bgR = bgR, g = g, r = r)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (bgA != null) __obj.updateDynamic("bgA")(bgA.asInstanceOf[js.Any])
    if (!js.isUndefined(bgDefaultColor)) __obj.updateDynamic("bgDefaultColor")(bgDefaultColor)
    if (!js.isUndefined(blink)) __obj.updateDynamic("blink")(blink)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (!js.isUndefined(charTransparency)) __obj.updateDynamic("charTransparency")(charTransparency)
    if (!js.isUndefined(defaultColor)) __obj.updateDynamic("defaultColor")(defaultColor)
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim)
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


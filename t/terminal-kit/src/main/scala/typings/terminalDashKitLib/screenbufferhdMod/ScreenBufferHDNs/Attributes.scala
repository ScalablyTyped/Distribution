package typings
package terminalDashKitLib.screenbufferhdMod.ScreenBufferHDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var b: scala.Double
  var bgA: js.UndefOr[scala.Double] = js.undefined
  var bgB: scala.Double
  var bgDefaultColor: js.UndefOr[scala.Boolean] = js.undefined
  var bgG: scala.Double
  var bgR: scala.Double
  var blink: js.UndefOr[scala.Boolean] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var charTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var defaultColor: js.UndefOr[scala.Boolean] = js.undefined
  var dim: js.UndefOr[scala.Boolean] = js.undefined
  var g: scala.Double
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var r: scala.Double
  var strike: js.UndefOr[scala.Boolean] = js.undefined
  var styleTransparency: js.UndefOr[scala.Boolean] = js.undefined
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    b: scala.Double,
    bgB: scala.Double,
    bgG: scala.Double,
    bgR: scala.Double,
    g: scala.Double,
    r: scala.Double,
    a: scala.Int | scala.Double = null,
    bgA: scala.Int | scala.Double = null,
    bgDefaultColor: js.UndefOr[scala.Boolean] = js.undefined,
    blink: js.UndefOr[scala.Boolean] = js.undefined,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    charTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    defaultColor: js.UndefOr[scala.Boolean] = js.undefined,
    dim: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    strike: js.UndefOr[scala.Boolean] = js.undefined,
    styleTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("bgB")(bgB)
    __obj.updateDynamic("bgG")(bgG)
    __obj.updateDynamic("bgR")(bgR)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
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


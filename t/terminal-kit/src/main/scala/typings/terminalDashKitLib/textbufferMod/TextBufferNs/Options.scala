package typings
package terminalDashKitLib.textbufferMod.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dst: terminalDashKitLib.screenbufferMod.namespaced
  var forceInBound: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var tabWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dst: terminalDashKitLib.screenbufferMod.namespaced,
    forceInBound: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    tabWidth: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(dst = dst)
    if (forceInBound != null) __obj.updateDynamic("forceInBound")(forceInBound.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  var iconSpacing: js.UndefOr[scala.Double] = js.undefined
  var icons: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[LegendPositionOptions] = js.undefined
  var right: js.UndefOr[LegendPositionOptions] = js.undefined
}

object LegendOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconSize: scala.Int | scala.Double = null,
    iconSpacing: scala.Int | scala.Double = null,
    icons: js.UndefOr[scala.Boolean] = js.undefined,
    left: LegendPositionOptions = null,
    right: LegendPositionOptions = null
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconSpacing != null) __obj.updateDynamic("iconSpacing")(iconSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[LegendOptions]
  }
}


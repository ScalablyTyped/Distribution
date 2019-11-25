package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var iconSpacing: js.UndefOr[Double] = js.undefined
  var icons: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[LegendPositionOptions] = js.undefined
  var right: js.UndefOr[LegendPositionOptions] = js.undefined
}

object LegendOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    iconSize: Int | Double = null,
    iconSpacing: Int | Double = null,
    icons: js.UndefOr[Boolean] = js.undefined,
    left: LegendPositionOptions = null,
    right: LegendPositionOptions = null
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconSpacing != null) __obj.updateDynamic("iconSpacing")(iconSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendOptions]
  }
}


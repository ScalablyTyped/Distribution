package typings.vegaTypings.configMod

import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.layoutMod.LayoutBounds
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayout extends BaseLegendLayout {
  var bottom: js.UndefOr[BaseLegendLayout] = js.undefined
  var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.undefined
  var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.undefined
  var left: js.UndefOr[BaseLegendLayout] = js.undefined
  var right: js.UndefOr[BaseLegendLayout] = js.undefined
  var top: js.UndefOr[BaseLegendLayout] = js.undefined
  var `top-left`: js.UndefOr[BaseLegendLayout] = js.undefined
  var `top-right`: js.UndefOr[BaseLegendLayout] = js.undefined
}

object LegendLayout {
  @scala.inline
  def apply(
    anchor: TitleAnchor | SignalRef = null,
    bottom: BaseLegendLayout = null,
    `bottom-left`: BaseLegendLayout = null,
    `bottom-right`: BaseLegendLayout = null,
    bounds: LayoutBounds = null,
    center: Boolean | SignalRef = null,
    direction: Orientation | SignalRef = null,
    left: BaseLegendLayout = null,
    margin: Double | SignalRef = null,
    offset: Double | SignalRef = null,
    right: BaseLegendLayout = null,
    top: BaseLegendLayout = null,
    `top-left`: BaseLegendLayout = null,
    `top-right`: BaseLegendLayout = null
  ): LegendLayout = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (`bottom-left` != null) __obj.updateDynamic("bottom-left")(`bottom-left`.asInstanceOf[js.Any])
    if (`bottom-right` != null) __obj.updateDynamic("bottom-right")(`bottom-right`.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`top-left` != null) __obj.updateDynamic("top-left")(`top-left`.asInstanceOf[js.Any])
    if (`top-right` != null) __obj.updateDynamic("top-right")(`top-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendLayout]
  }
}


package typings.victory

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxisLabel extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.undefined
  var axisLabel: js.UndefOr[CSSProperties] = js.undefined
  var grid: js.UndefOr[KinkeyofCSSPropertiesstri] = js.undefined
  var parent: js.UndefOr[CSSProperties] = js.undefined
  var tickLabels: js.UndefOr[KinkeyofCSSPropertiesstri] = js.undefined
  var ticks: js.UndefOr[KinkeyofCSSPropertiesstri] = js.undefined
}

object AnonAxisLabel {
  @scala.inline
  def apply(
    axis: CSSProperties = null,
    axisLabel: CSSProperties = null,
    grid: KinkeyofCSSPropertiesstri = null,
    parent: CSSProperties = null,
    tickLabels: KinkeyofCSSPropertiesstri = null,
    ticks: KinkeyofCSSPropertiesstri = null
  ): AnonAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tickLabels != null) __obj.updateDynamic("tickLabels")(tickLabels.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxisLabel]
  }
}


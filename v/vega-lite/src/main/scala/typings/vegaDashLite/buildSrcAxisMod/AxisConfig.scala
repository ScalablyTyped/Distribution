package typings.vegaDashLite.buildSrcAxisMod

import typings.vegaDashLite.buildSrcGuideMod.VlOnlyGuideConfig
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.FontWeight
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxisConfig
import typings.vegaDashLite.vegaDashLiteStrings.greedy
import typings.vegaDashLite.vegaDashLiteStrings.parity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisConfig
  extends VgAxisConfig
     with VlOnlyGuideConfig

object AxisConfig {
  @scala.inline
  def apply(
    bandPosition: Int | Double = null,
    domain: js.UndefOr[Boolean] = js.undefined,
    domainColor: String = null,
    domainWidth: Int | Double = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridColor: String = null,
    gridDash: js.Array[Double] = null,
    gridOpacity: Int | Double = null,
    gridWidth: Int | Double = null,
    labelAngle: Int | Double = null,
    labelBound: Boolean | Double = null,
    labelColor: String = null,
    labelFlush: Boolean | Double = null,
    labelFont: String = null,
    labelFontSize: Int | Double = null,
    labelLimit: Int | Double = null,
    labelOverlap: Boolean | parity | greedy = null,
    labelPadding: Int | Double = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    maxExtent: Int | Double = null,
    minExtent: Int | Double = null,
    shortTimeLabels: js.UndefOr[Boolean] = js.undefined,
    tickColor: String = null,
    tickRound: js.UndefOr[Boolean] = js.undefined,
    tickSize: Int | Double = null,
    tickWidth: Int | Double = null,
    ticks: js.UndefOr[Boolean] = js.undefined,
    titleAlign: String = null,
    titleAngle: Int | Double = null,
    titleBaseline: String = null,
    titleColor: String = null,
    titleFont: String = null,
    titleFontSize: Int | Double = null,
    titleFontWeight: FontWeight = null,
    titleLimit: Int | Double = null,
    titleMaxLength: Int | Double = null,
    titlePadding: Int | Double = null,
    titleX: Int | Double = null,
    titleY: Int | Double = null
  ): AxisConfig = {
    val __obj = js.Dynamic.literal()
    if (bandPosition != null) __obj.updateDynamic("bandPosition")(bandPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (domainColor != null) __obj.updateDynamic("domainColor")(domainColor)
    if (domainWidth != null) __obj.updateDynamic("domainWidth")(domainWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor)
    if (gridDash != null) __obj.updateDynamic("gridDash")(gridDash)
    if (gridOpacity != null) __obj.updateDynamic("gridOpacity")(gridOpacity.asInstanceOf[js.Any])
    if (gridWidth != null) __obj.updateDynamic("gridWidth")(gridWidth.asInstanceOf[js.Any])
    if (labelAngle != null) __obj.updateDynamic("labelAngle")(labelAngle.asInstanceOf[js.Any])
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (labelFontSize != null) __obj.updateDynamic("labelFontSize")(labelFontSize.asInstanceOf[js.Any])
    if (labelLimit != null) __obj.updateDynamic("labelLimit")(labelLimit.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (!js.isUndefined(shortTimeLabels)) __obj.updateDynamic("shortTimeLabels")(shortTimeLabels)
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    if (!js.isUndefined(tickRound)) __obj.updateDynamic("tickRound")(tickRound)
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickWidth != null) __obj.updateDynamic("tickWidth")(tickWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks)
    if (titleAlign != null) __obj.updateDynamic("titleAlign")(titleAlign)
    if (titleAngle != null) __obj.updateDynamic("titleAngle")(titleAngle.asInstanceOf[js.Any])
    if (titleBaseline != null) __obj.updateDynamic("titleBaseline")(titleBaseline)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleFont != null) __obj.updateDynamic("titleFont")(titleFont)
    if (titleFontSize != null) __obj.updateDynamic("titleFontSize")(titleFontSize.asInstanceOf[js.Any])
    if (titleFontWeight != null) __obj.updateDynamic("titleFontWeight")(titleFontWeight.asInstanceOf[js.Any])
    if (titleLimit != null) __obj.updateDynamic("titleLimit")(titleLimit.asInstanceOf[js.Any])
    if (titleMaxLength != null) __obj.updateDynamic("titleMaxLength")(titleMaxLength.asInstanceOf[js.Any])
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (titleX != null) __obj.updateDynamic("titleX")(titleX.asInstanceOf[js.Any])
    if (titleY != null) __obj.updateDynamic("titleY")(titleY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisConfig]
  }
}


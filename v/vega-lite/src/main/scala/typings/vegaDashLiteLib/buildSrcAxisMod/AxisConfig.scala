package typings
package vegaDashLiteLib.buildSrcAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisConfig
  extends vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxisConfig
     with vegaDashLiteLib.buildSrcGuideMod.VlOnlyGuideConfig

object AxisConfig {
  @scala.inline
  def apply(
    bandPosition: scala.Int | scala.Double = null,
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    domainColor: java.lang.String = null,
    domainWidth: scala.Int | scala.Double = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridColor: java.lang.String = null,
    gridDash: js.Array[scala.Double] = null,
    gridOpacity: scala.Int | scala.Double = null,
    gridWidth: scala.Int | scala.Double = null,
    labelAngle: scala.Int | scala.Double = null,
    labelBound: scala.Boolean | scala.Double = null,
    labelColor: java.lang.String = null,
    labelFlush: scala.Boolean | scala.Double = null,
    labelFont: java.lang.String = null,
    labelFontSize: scala.Int | scala.Double = null,
    labelLimit: scala.Int | scala.Double = null,
    labelOverlap: scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy = null,
    labelPadding: scala.Int | scala.Double = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: scala.Int | scala.Double = null,
    minExtent: scala.Int | scala.Double = null,
    shortTimeLabels: js.UndefOr[scala.Boolean] = js.undefined,
    tickColor: java.lang.String = null,
    tickRound: js.UndefOr[scala.Boolean] = js.undefined,
    tickSize: scala.Int | scala.Double = null,
    tickWidth: scala.Int | scala.Double = null,
    ticks: js.UndefOr[scala.Boolean] = js.undefined,
    titleAlign: java.lang.String = null,
    titleAngle: scala.Int | scala.Double = null,
    titleBaseline: java.lang.String = null,
    titleColor: java.lang.String = null,
    titleFont: java.lang.String = null,
    titleFontSize: scala.Int | scala.Double = null,
    titleFontWeight: vegaDashLiteLib.buildSrcVegaDotSchemaMod.FontWeight = null,
    titleLimit: scala.Int | scala.Double = null,
    titleMaxLength: scala.Int | scala.Double = null,
    titlePadding: scala.Int | scala.Double = null,
    titleX: scala.Int | scala.Double = null,
    titleY: scala.Int | scala.Double = null
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


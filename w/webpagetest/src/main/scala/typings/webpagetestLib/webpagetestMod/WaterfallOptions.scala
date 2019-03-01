package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallOptions extends js.Object {
  /** set the chart type: waterfall or connection [waterfall] */
  var chartType: js.UndefOr[java.lang.String] = js.undefined
  /** chart image width in px (300-2000) [930] */
  var chartWidth: js.UndefOr[scala.Double] = js.undefined
  /** set chart coloring by MIME type [false] */
  var colorByMime: js.UndefOr[scala.Boolean] = js.undefined
  /** set maximum time in seconds [automatic] */
  var maxTime: js.UndefOr[scala.Double] = js.undefined
  /** hide bandwidth utilization [false] */
  var noBandwidth: js.UndefOr[scala.Boolean] = js.undefined
  /** hide CPU utilization [false] */
  var noCPU: js.UndefOr[scala.Boolean] = js.undefined
  /** hide ellipsis (...) for missing items [false] */
  var noEllipsis: js.UndefOr[scala.Boolean] = js.undefined
  /** hide labels for requests (URL) [false] */
  var noLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** filter requests (e.g.:1,2,3,4-9,8) [all] */
  var requests: js.UndefOr[java.lang.String] = js.undefined
}

object WaterfallOptions {
  @scala.inline
  def apply(
    chartType: java.lang.String = null,
    chartWidth: scala.Int | scala.Double = null,
    colorByMime: js.UndefOr[scala.Boolean] = js.undefined,
    maxTime: scala.Int | scala.Double = null,
    noBandwidth: js.UndefOr[scala.Boolean] = js.undefined,
    noCPU: js.UndefOr[scala.Boolean] = js.undefined,
    noEllipsis: js.UndefOr[scala.Boolean] = js.undefined,
    noLabels: js.UndefOr[scala.Boolean] = js.undefined,
    requests: java.lang.String = null
  ): WaterfallOptions = {
    val __obj = js.Dynamic.literal()
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByMime)) __obj.updateDynamic("colorByMime")(colorByMime)
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (!js.isUndefined(noBandwidth)) __obj.updateDynamic("noBandwidth")(noBandwidth)
    if (!js.isUndefined(noCPU)) __obj.updateDynamic("noCPU")(noCPU)
    if (!js.isUndefined(noEllipsis)) __obj.updateDynamic("noEllipsis")(noEllipsis)
    if (!js.isUndefined(noLabels)) __obj.updateDynamic("noLabels")(noLabels)
    if (requests != null) __obj.updateDynamic("requests")(requests)
    __obj.asInstanceOf[WaterfallOptions]
  }
}


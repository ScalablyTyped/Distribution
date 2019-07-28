package typings.webpagetest.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallOptions extends js.Object {
  /** set the chart type: waterfall or connection [waterfall] */
  var chartType: js.UndefOr[String] = js.undefined
  /** chart image width in px (300-2000) [930] */
  var chartWidth: js.UndefOr[Double] = js.undefined
  /** set chart coloring by MIME type [false] */
  var colorByMime: js.UndefOr[Boolean] = js.undefined
  /** set maximum time in seconds [automatic] */
  var maxTime: js.UndefOr[Double] = js.undefined
  /** hide bandwidth utilization [false] */
  var noBandwidth: js.UndefOr[Boolean] = js.undefined
  /** hide CPU utilization [false] */
  var noCPU: js.UndefOr[Boolean] = js.undefined
  /** hide ellipsis (...) for missing items [false] */
  var noEllipsis: js.UndefOr[Boolean] = js.undefined
  /** hide labels for requests (URL) [false] */
  var noLabels: js.UndefOr[Boolean] = js.undefined
  /** filter requests (e.g.:1,2,3,4-9,8) [all] */
  var requests: js.UndefOr[String] = js.undefined
}

object WaterfallOptions {
  @scala.inline
  def apply(
    chartType: String = null,
    chartWidth: Int | Double = null,
    colorByMime: js.UndefOr[Boolean] = js.undefined,
    maxTime: Int | Double = null,
    noBandwidth: js.UndefOr[Boolean] = js.undefined,
    noCPU: js.UndefOr[Boolean] = js.undefined,
    noEllipsis: js.UndefOr[Boolean] = js.undefined,
    noLabels: js.UndefOr[Boolean] = js.undefined,
    requests: String = null
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


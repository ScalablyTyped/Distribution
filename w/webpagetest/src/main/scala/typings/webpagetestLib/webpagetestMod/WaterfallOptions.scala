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


package typings.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterfallOptions extends js.Object {
  /** set the chart type: waterfall or connection [waterfall] */
  var chartType: js.UndefOr[String] = js.native
  /** chart image width in px (300-2000) [930] */
  var chartWidth: js.UndefOr[Double] = js.native
  /** set chart coloring by MIME type [false] */
  var colorByMime: js.UndefOr[Boolean] = js.native
  /** set maximum time in seconds [automatic] */
  var maxTime: js.UndefOr[Double] = js.native
  /** hide bandwidth utilization [false] */
  var noBandwidth: js.UndefOr[Boolean] = js.native
  /** hide CPU utilization [false] */
  var noCPU: js.UndefOr[Boolean] = js.native
  /** hide ellipsis (...) for missing items [false] */
  var noEllipsis: js.UndefOr[Boolean] = js.native
  /** hide labels for requests (URL) [false] */
  var noLabels: js.UndefOr[Boolean] = js.native
  /** filter requests (e.g.:1,2,3,4-9,8) [all] */
  var requests: js.UndefOr[String] = js.native
}

object WaterfallOptions {
  @scala.inline
  def apply(): WaterfallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallOptions]
  }
  @scala.inline
  implicit class WaterfallOptionsOps[Self <: WaterfallOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChartType(value: String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    @scala.inline
    def setChartWidth(value: Double): Self = this.set("chartWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartWidth: Self = this.set("chartWidth", js.undefined)
    @scala.inline
    def setColorByMime(value: Boolean): Self = this.set("colorByMime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorByMime: Self = this.set("colorByMime", js.undefined)
    @scala.inline
    def setMaxTime(value: Double): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setNoBandwidth(value: Boolean): Self = this.set("noBandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBandwidth: Self = this.set("noBandwidth", js.undefined)
    @scala.inline
    def setNoCPU(value: Boolean): Self = this.set("noCPU", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCPU: Self = this.set("noCPU", js.undefined)
    @scala.inline
    def setNoEllipsis(value: Boolean): Self = this.set("noEllipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEllipsis: Self = this.set("noEllipsis", js.undefined)
    @scala.inline
    def setNoLabels(value: Boolean): Self = this.set("noLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLabels: Self = this.set("noLabels", js.undefined)
    @scala.inline
    def setRequests(value: String): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
  
}


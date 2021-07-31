package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterfallOptions extends StObject {
  
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
  def apply(): WaterfallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallOptions]
  }
  
  @scala.inline
  implicit class WaterfallOptionsMutableBuilder[Self <: WaterfallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setChartWidth(value: Double): Self = StObject.set(x, "chartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartWidthUndefined: Self = StObject.set(x, "chartWidth", js.undefined)
    
    @scala.inline
    def setColorByMime(value: Boolean): Self = StObject.set(x, "colorByMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorByMimeUndefined: Self = StObject.set(x, "colorByMime", js.undefined)
    
    @scala.inline
    def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    
    @scala.inline
    def setNoBandwidth(value: Boolean): Self = StObject.set(x, "noBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBandwidthUndefined: Self = StObject.set(x, "noBandwidth", js.undefined)
    
    @scala.inline
    def setNoCPU(value: Boolean): Self = StObject.set(x, "noCPU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCPUUndefined: Self = StObject.set(x, "noCPU", js.undefined)
    
    @scala.inline
    def setNoEllipsis(value: Boolean): Self = StObject.set(x, "noEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEllipsisUndefined: Self = StObject.set(x, "noEllipsis", js.undefined)
    
    @scala.inline
    def setNoLabels(value: Boolean): Self = StObject.set(x, "noLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLabelsUndefined: Self = StObject.set(x, "noLabels", js.undefined)
    
    @scala.inline
    def setRequests(value: String): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}

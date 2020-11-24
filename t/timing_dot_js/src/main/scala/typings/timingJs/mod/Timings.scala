package typings.timingJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timings extends js.Object {
  
  var appcacheTime: Double = js.native
  
  var connectEnd: Double = js.native
  
  var connectStart: Double = js.native
  
  var connectTime: Double = js.native
  
  var domComplete: Double = js.native
  
  var domContentLoadedEventEnd: Double = js.native
  
  var domContentLoadedEventStart: Double = js.native
  
  var domInteractive: Double = js.native
  
  var domLoading: Double = js.native
  
  var domReadyTime: Double = js.native
  
  var domainLookupEnd: Double = js.native
  
  var domainLookupStart: Double = js.native
  
  var fetchStart: Double = js.native
  
  var firstPaint: Double = js.native
  
  var firstPaintTime: Double = js.native
  
  var initDomTreeTime: Double = js.native
  
  var loadEventEnd: Double = js.native
  
  var loadEventStart: Double = js.native
  
  var loadEventTime: Double = js.native
  
  var loadTime: Double = js.native
  
  var lookupDomainTime: Double = js.native
  
  var navigationStart: Double = js.native
  
  var readyStart: Double = js.native
  
  var redirectEnd: Double = js.native
  
  var redirectStart: Double = js.native
  
  var redirectTime: Double = js.native
  
  var requestStart: Double = js.native
  
  var requestTime: Double = js.native
  
  var responseEnd: Double = js.native
  
  var responseStart: Double = js.native
  
  var secureConnectionStart: Double = js.native
  
  var unloadEventEnd: Double = js.native
  
  var unloadEventStart: Double = js.native
  
  var unloadEventTime: Double = js.native
}
object Timings {
  
  @scala.inline
  def apply(
    appcacheTime: Double,
    connectEnd: Double,
    connectStart: Double,
    connectTime: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domReadyTime: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    firstPaint: Double,
    firstPaintTime: Double,
    initDomTreeTime: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    loadEventTime: Double,
    loadTime: Double,
    lookupDomainTime: Double,
    navigationStart: Double,
    readyStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    redirectTime: Double,
    requestStart: Double,
    requestTime: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    unloadEventEnd: Double,
    unloadEventStart: Double,
    unloadEventTime: Double
  ): Timings = {
    val __obj = js.Dynamic.literal(appcacheTime = appcacheTime.asInstanceOf[js.Any], connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], connectTime = connectTime.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domReadyTime = domReadyTime.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], firstPaint = firstPaint.asInstanceOf[js.Any], firstPaintTime = firstPaintTime.asInstanceOf[js.Any], initDomTreeTime = initDomTreeTime.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], loadEventTime = loadEventTime.asInstanceOf[js.Any], loadTime = loadTime.asInstanceOf[js.Any], lookupDomainTime = lookupDomainTime.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], readyStart = readyStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], redirectTime = redirectTime.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any], unloadEventTime = unloadEventTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timings]
  }
  
  @scala.inline
  implicit class TimingsOps[Self <: Timings] (val x: Self) extends AnyVal {
    
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
    def setAppcacheTime(value: Double): Self = this.set("appcacheTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectEnd(value: Double): Self = this.set("connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = this.set("connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTime(value: Double): Self = this.set("connectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomComplete(value: Double): Self = this.set("domComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = this.set("domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = this.set("domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomInteractive(value: Double): Self = this.set("domInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomLoading(value: Double): Self = this.set("domLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomReadyTime(value: Double): Self = this.set("domReadyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = this.set("domainLookupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupStart(value: Double): Self = this.set("domainLookupStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPaint(value: Double): Self = this.set("firstPaint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPaintTime(value: Double): Self = this.set("firstPaintTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitDomTreeTime(value: Double): Self = this.set("initDomTreeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventEnd(value: Double): Self = this.set("loadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventStart(value: Double): Self = this.set("loadEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventTime(value: Double): Self = this.set("loadEventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTime(value: Double): Self = this.set("loadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupDomainTime(value: Double): Self = this.set("lookupDomainTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationStart(value: Double): Self = this.set("navigationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyStart(value: Double): Self = this.set("readyStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectEnd(value: Double): Self = this.set("redirectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectStart(value: Double): Self = this.set("redirectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectTime(value: Double): Self = this.set("redirectTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStart(value: Double): Self = this.set("requestStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTime(value: Double): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseEnd(value: Double): Self = this.set("responseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStart(value: Double): Self = this.set("responseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureConnectionStart(value: Double): Self = this.set("secureConnectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = this.set("unloadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventStart(value: Double): Self = this.set("unloadEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventTime(value: Double): Self = this.set("unloadEventTime", value.asInstanceOf[js.Any])
  }
}

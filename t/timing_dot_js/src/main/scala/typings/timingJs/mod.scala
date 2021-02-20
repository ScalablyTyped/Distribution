package typings.timingJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timing.js", "getTimes")
  @js.native
  def getTimes(): Timings = js.native
  
  @JSImport("timing.js", "printSimpleTable")
  @js.native
  def printSimpleTable(): Unit = js.native
  
  @JSImport("timing.js", "printTable")
  @js.native
  def printTable(): Unit = js.native
  
  @js.native
  trait Timings extends StObject {
    
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
    implicit class TimingsMutableBuilder[Self <: Timings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppcacheTime(value: Double): Self = StObject.set(x, "appcacheTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTime(value: Double): Self = StObject.set(x, "connectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomReadyTime(value: Double): Self = StObject.set(x, "domReadyTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPaint(value: Double): Self = StObject.set(x, "firstPaint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstPaintTime(value: Double): Self = StObject.set(x, "firstPaintTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitDomTreeTime(value: Double): Self = StObject.set(x, "initDomTreeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadEventTime(value: Double): Self = StObject.set(x, "loadEventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTime(value: Double): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupDomainTime(value: Double): Self = StObject.set(x, "lookupDomainTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadyStart(value: Double): Self = StObject.set(x, "readyStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectTime(value: Double): Self = StObject.set(x, "redirectTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnloadEventTime(value: Double): Self = StObject.set(x, "unloadEventTime", value.asInstanceOf[js.Any])
    }
  }
}

package typings.timingJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timing.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTimes(): Timings = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimes")().asInstanceOf[Timings]
  
  inline def printSimpleTable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printSimpleTable")().asInstanceOf[Unit]
  
  inline def printTable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printTable")().asInstanceOf[Unit]
  
  trait Timings extends StObject {
    
    var appcacheTime: Double
    
    var connectEnd: Double
    
    var connectStart: Double
    
    var connectTime: Double
    
    var domComplete: Double
    
    var domContentLoadedEventEnd: Double
    
    var domContentLoadedEventStart: Double
    
    var domInteractive: Double
    
    var domLoading: Double
    
    var domReadyTime: Double
    
    var domainLookupEnd: Double
    
    var domainLookupStart: Double
    
    var fetchStart: Double
    
    var firstPaint: Double
    
    var firstPaintTime: Double
    
    var initDomTreeTime: Double
    
    var loadEventEnd: Double
    
    var loadEventStart: Double
    
    var loadEventTime: Double
    
    var loadTime: Double
    
    var lookupDomainTime: Double
    
    var navigationStart: Double
    
    var readyStart: Double
    
    var redirectEnd: Double
    
    var redirectStart: Double
    
    var redirectTime: Double
    
    var requestStart: Double
    
    var requestTime: Double
    
    var responseEnd: Double
    
    var responseStart: Double
    
    var secureConnectionStart: Double
    
    var unloadEventEnd: Double
    
    var unloadEventStart: Double
    
    var unloadEventTime: Double
  }
  object Timings {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Timings] (val x: Self) extends AnyVal {
      
      inline def setAppcacheTime(value: Double): Self = StObject.set(x, "appcacheTime", value.asInstanceOf[js.Any])
      
      inline def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
      
      inline def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
      
      inline def setConnectTime(value: Double): Self = StObject.set(x, "connectTime", value.asInstanceOf[js.Any])
      
      inline def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
      
      inline def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
      
      inline def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
      
      inline def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
      
      inline def setDomReadyTime(value: Double): Self = StObject.set(x, "domReadyTime", value.asInstanceOf[js.Any])
      
      inline def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
      
      inline def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
      
      inline def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
      
      inline def setFirstPaint(value: Double): Self = StObject.set(x, "firstPaint", value.asInstanceOf[js.Any])
      
      inline def setFirstPaintTime(value: Double): Self = StObject.set(x, "firstPaintTime", value.asInstanceOf[js.Any])
      
      inline def setInitDomTreeTime(value: Double): Self = StObject.set(x, "initDomTreeTime", value.asInstanceOf[js.Any])
      
      inline def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
      
      inline def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
      
      inline def setLoadEventTime(value: Double): Self = StObject.set(x, "loadEventTime", value.asInstanceOf[js.Any])
      
      inline def setLoadTime(value: Double): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
      
      inline def setLookupDomainTime(value: Double): Self = StObject.set(x, "lookupDomainTime", value.asInstanceOf[js.Any])
      
      inline def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
      
      inline def setReadyStart(value: Double): Self = StObject.set(x, "readyStart", value.asInstanceOf[js.Any])
      
      inline def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
      
      inline def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
      
      inline def setRedirectTime(value: Double): Self = StObject.set(x, "redirectTime", value.asInstanceOf[js.Any])
      
      inline def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      inline def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
      
      inline def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
      
      inline def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
      
      inline def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
      
      inline def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
      
      inline def setUnloadEventTime(value: Double): Self = StObject.set(x, "unloadEventTime", value.asInstanceOf[js.Any])
    }
  }
}

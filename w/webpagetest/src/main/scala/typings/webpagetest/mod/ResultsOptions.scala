package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsOptions extends StObject {
  
  /** include the breakdown of requests and bytes by mime type */
  var breakDown: js.UndefOr[Boolean] = js.undefined
  
  /** include the breakdown of requests and bytes by domain */
  var domains: js.UndefOr[Boolean] = js.undefined
  
  /** set the metric used to calculate median for multiple runs tests (default: loadTime) */
  var medianMetric: js.UndefOr[String] = js.undefined
  
  /** include the PageSpeed score in the response (may be slower) */
  var pageSpeed: js.UndefOr[Boolean] = js.undefined
  
  /** set performance test suite reporter output: [dot]|spec|tap|xunit|list|progress|min|nyan|landing|json|doc|markdown|teamcity */
  var reporter: js.UndefOr[String] = js.undefined
  
  /** include the request data in the response (slower and results in much larger responses) */
  var requests: js.UndefOr[Boolean] = js.undefined
  
  /** set the specs for performance test suite */
  var specs: js.UndefOr[String] = js.undefined
}
object ResultsOptions {
  
  inline def apply(): ResultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsOptions]
  }
  
  extension [Self <: ResultsOptions](x: Self) {
    
    inline def setBreakDown(value: Boolean): Self = StObject.set(x, "breakDown", value.asInstanceOf[js.Any])
    
    inline def setBreakDownUndefined: Self = StObject.set(x, "breakDown", js.undefined)
    
    inline def setDomains(value: Boolean): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setMedianMetric(value: String): Self = StObject.set(x, "medianMetric", value.asInstanceOf[js.Any])
    
    inline def setMedianMetricUndefined: Self = StObject.set(x, "medianMetric", js.undefined)
    
    inline def setPageSpeed(value: Boolean): Self = StObject.set(x, "pageSpeed", value.asInstanceOf[js.Any])
    
    inline def setPageSpeedUndefined: Self = StObject.set(x, "pageSpeed", js.undefined)
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setRequests(value: Boolean): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setSpecs(value: String): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
  }
}

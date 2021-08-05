package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<workbox-core.workbox-core/setCacheNameDetails.CacheNameDetails> */
  trait PartialCacheNameDetails extends StObject {
    
    var googleAnalytics: js.UndefOr[String] = js.undefined
    
    var precache: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var runtime: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object PartialCacheNameDetails {
    
    inline def apply(): PartialCacheNameDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCacheNameDetails]
    }
    
    extension [Self <: PartialCacheNameDetails](x: Self) {
      
      inline def setGoogleAnalytics(value: String): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "googleAnalytics", js.undefined)
      
      inline def setPrecache(value: String): Self = StObject.set(x, "precache", value.asInstanceOf[js.Any])
      
      inline def setPrecacheUndefined: Self = StObject.set(x, "precache", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}

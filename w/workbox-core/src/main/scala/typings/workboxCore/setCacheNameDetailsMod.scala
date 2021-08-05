package typings.workboxCore

import typings.workboxCore.anon.PartialCacheNameDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setCacheNameDetailsMod {
  
  @JSImport("workbox-core/setCacheNameDetails", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setCacheNameDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheNameDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CacheNameDetails extends StObject {
    
    var googleAnalytics: String
    
    var precache: String
    
    var prefix: String
    
    var runtime: String
    
    var suffix: String
  }
  object CacheNameDetails {
    
    inline def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNameDetails = {
      val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics.asInstanceOf[js.Any], precache = precache.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheNameDetails]
    }
    
    extension [Self <: CacheNameDetails](x: Self) {
      
      inline def setGoogleAnalytics(value: String): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      inline def setPrecache(value: String): Self = StObject.set(x, "precache", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
}

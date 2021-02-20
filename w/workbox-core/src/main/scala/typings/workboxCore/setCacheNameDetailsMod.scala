package typings.workboxCore

import typings.workboxCore.anon.PartialCacheNameDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setCacheNameDetailsMod {
  
  @JSImport("workbox-core/setCacheNameDetails", "setCacheNameDetails")
  @js.native
  def setCacheNameDetails(details: PartialCacheNameDetails): Unit = js.native
  
  @js.native
  trait CacheNameDetails extends StObject {
    
    var googleAnalytics: String = js.native
    
    var precache: String = js.native
    
    var prefix: String = js.native
    
    var runtime: String = js.native
    
    var suffix: String = js.native
  }
  object CacheNameDetails {
    
    @scala.inline
    def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNameDetails = {
      val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics.asInstanceOf[js.Any], precache = precache.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheNameDetails]
    }
    
    @scala.inline
    implicit class CacheNameDetailsMutableBuilder[Self <: CacheNameDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGoogleAnalytics(value: String): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecache(value: String): Self = StObject.set(x, "precache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
}

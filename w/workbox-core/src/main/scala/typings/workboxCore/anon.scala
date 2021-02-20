package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<workbox-core.workbox-core/setCacheNameDetails.CacheNameDetails> */
  @js.native
  trait PartialCacheNameDetails extends StObject {
    
    var googleAnalytics: js.UndefOr[String] = js.native
    
    var precache: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var runtime: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object PartialCacheNameDetails {
    
    @scala.inline
    def apply(): PartialCacheNameDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCacheNameDetails]
    }
    
    @scala.inline
    implicit class PartialCacheNameDetailsMutableBuilder[Self <: PartialCacheNameDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGoogleAnalytics(value: String): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleAnalyticsUndefined: Self = StObject.set(x, "googleAnalytics", js.undefined)
      
      @scala.inline
      def setPrecache(value: String): Self = StObject.set(x, "precache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecacheUndefined: Self = StObject.set(x, "precache", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}

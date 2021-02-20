package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheNamesMod {
  
  @JSImport("workbox-core/cacheNames", "cacheNames")
  @js.native
  val cacheNames: CacheNames_ = js.native
  
  @js.native
  trait CacheNames_ extends StObject {
    
    val googleAnalytics: String = js.native
    
    val precache: String = js.native
    
    val prefix: String = js.native
    
    val runtime: String = js.native
    
    val suffix: String = js.native
  }
  object CacheNames_ {
    
    @scala.inline
    def apply(googleAnalytics: String, precache: String, prefix: String, runtime: String, suffix: String): CacheNames_ = {
      val __obj = js.Dynamic.literal(googleAnalytics = googleAnalytics.asInstanceOf[js.Any], precache = precache.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheNames_]
    }
    
    @scala.inline
    implicit class CacheNames_MutableBuilder[Self <: CacheNames_] (val x: Self) extends AnyVal {
      
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

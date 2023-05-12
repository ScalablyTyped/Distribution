package typings.workboxCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateCacheNamesMod {
  
  object cacheNames {
    
    @JSImport("workbox-core/_private/cacheNames", "cacheNames")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getGoogleAnalyticsName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleAnalyticsName")().asInstanceOf[String]
    inline def getGoogleAnalyticsName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleAnalyticsName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getPrecacheName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecacheName")().asInstanceOf[String]
    inline def getPrecacheName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecacheName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")().asInstanceOf[String]
    
    inline def getRuntimeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeName")().asInstanceOf[String]
    inline def getRuntimeName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSuffix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")().asInstanceOf[String]
    
    inline def updateDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheNameDetails] (val x: Self) extends AnyVal {
      
      inline def setGoogleAnalytics(value: String): Self = StObject.set(x, "googleAnalytics", value.asInstanceOf[js.Any])
      
      inline def setPrecache(value: String): Self = StObject.set(x, "precache", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.workboxCore.workboxCoreStrings.googleAnalytics
    - typings.workboxCore.workboxCoreStrings.precache
    - typings.workboxCore.workboxCoreStrings.prefix
    - typings.workboxCore.workboxCoreStrings.runtime
    - typings.workboxCore.workboxCoreStrings.suffix
  */
  trait CacheNameDetailsProp extends StObject
  object CacheNameDetailsProp {
    
    inline def googleAnalytics: typings.workboxCore.workboxCoreStrings.googleAnalytics = "googleAnalytics".asInstanceOf[typings.workboxCore.workboxCoreStrings.googleAnalytics]
    
    inline def precache: typings.workboxCore.workboxCoreStrings.precache = "precache".asInstanceOf[typings.workboxCore.workboxCoreStrings.precache]
    
    inline def prefix: typings.workboxCore.workboxCoreStrings.prefix = "prefix".asInstanceOf[typings.workboxCore.workboxCoreStrings.prefix]
    
    inline def runtime: typings.workboxCore.workboxCoreStrings.runtime = "runtime".asInstanceOf[typings.workboxCore.workboxCoreStrings.runtime]
    
    inline def suffix: typings.workboxCore.workboxCoreStrings.suffix = "suffix".asInstanceOf[typings.workboxCore.workboxCoreStrings.suffix]
  }
  
  type PartialCacheNameDetails = StringDictionary[String]
}

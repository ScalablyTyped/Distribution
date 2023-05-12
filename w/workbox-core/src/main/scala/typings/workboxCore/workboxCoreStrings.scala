package typings.workboxCore

import typings.workboxCore.modelsPluginEventsMod.pluginEvents
import typings.workboxCore.privateCacheNamesMod.CacheNameDetailsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxCoreStrings {
  
  @js.native
  sealed trait cacheDidUpdate
    extends StObject
       with pluginEvents
  inline def cacheDidUpdate: cacheDidUpdate = "cacheDidUpdate".asInstanceOf[cacheDidUpdate]
  
  @js.native
  sealed trait cacheKeyWillBeUsed
    extends StObject
       with pluginEvents
  inline def cacheKeyWillBeUsed: cacheKeyWillBeUsed = "cacheKeyWillBeUsed".asInstanceOf[cacheKeyWillBeUsed]
  
  @js.native
  sealed trait cacheWillUpdate
    extends StObject
       with pluginEvents
  inline def cacheWillUpdate: cacheWillUpdate = "cacheWillUpdate".asInstanceOf[cacheWillUpdate]
  
  @js.native
  sealed trait cachedResponseWillBeUsed
    extends StObject
       with pluginEvents
  inline def cachedResponseWillBeUsed: cachedResponseWillBeUsed = "cachedResponseWillBeUsed".asInstanceOf[cachedResponseWillBeUsed]
  
  @js.native
  sealed trait fetchDidFail
    extends StObject
       with pluginEvents
  inline def fetchDidFail: fetchDidFail = "fetchDidFail".asInstanceOf[fetchDidFail]
  
  @js.native
  sealed trait fetchDidSucceed
    extends StObject
       with pluginEvents
  inline def fetchDidSucceed: fetchDidSucceed = "fetchDidSucceed".asInstanceOf[fetchDidSucceed]
  
  @js.native
  sealed trait googleAnalytics
    extends StObject
       with CacheNameDetailsProp
  inline def googleAnalytics: googleAnalytics = "googleAnalytics".asInstanceOf[googleAnalytics]
  
  @js.native
  sealed trait precache
    extends StObject
       with CacheNameDetailsProp
  inline def precache: precache = "precache".asInstanceOf[precache]
  
  @js.native
  sealed trait prefix
    extends StObject
       with CacheNameDetailsProp
  inline def prefix: prefix = "prefix".asInstanceOf[prefix]
  
  @js.native
  sealed trait requestWillFetch
    extends StObject
       with pluginEvents
  inline def requestWillFetch: requestWillFetch = "requestWillFetch".asInstanceOf[requestWillFetch]
  
  @js.native
  sealed trait runtime
    extends StObject
       with CacheNameDetailsProp
  inline def runtime: runtime = "runtime".asInstanceOf[runtime]
  
  @js.native
  sealed trait suffix
    extends StObject
       with CacheNameDetailsProp
  inline def suffix: suffix = "suffix".asInstanceOf[suffix]
}

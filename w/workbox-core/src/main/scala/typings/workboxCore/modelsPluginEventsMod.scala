package typings.workboxCore

import typings.workboxCore.workboxCoreStrings.cacheDidUpdate
import typings.workboxCore.workboxCoreStrings.cacheKeyWillBeUsed
import typings.workboxCore.workboxCoreStrings.cacheWillUpdate
import typings.workboxCore.workboxCoreStrings.cachedResponseWillBeUsed
import typings.workboxCore.workboxCoreStrings.fetchDidFail
import typings.workboxCore.workboxCoreStrings.fetchDidSucceed
import typings.workboxCore.workboxCoreStrings.requestWillFetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsPluginEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.workboxCore.workboxCoreStrings.cacheDidUpdate
    - typings.workboxCore.workboxCoreStrings.cacheKeyWillBeUsed
    - typings.workboxCore.workboxCoreStrings.cacheWillUpdate
    - typings.workboxCore.workboxCoreStrings.cachedResponseWillBeUsed
    - typings.workboxCore.workboxCoreStrings.fetchDidFail
    - typings.workboxCore.workboxCoreStrings.fetchDidSucceed
    - typings.workboxCore.workboxCoreStrings.requestWillFetch
  */
  trait pluginEvents extends StObject
  object pluginEvents {
    
    inline def CACHED_RESPONSE_WILL_BE_USED: cachedResponseWillBeUsed = "cachedResponseWillBeUsed".asInstanceOf[cachedResponseWillBeUsed]
    
    inline def CACHE_DID_UPDATE: cacheDidUpdate = "cacheDidUpdate".asInstanceOf[cacheDidUpdate]
    
    inline def CACHE_KEY_WILL_BE_USED: cacheKeyWillBeUsed = "cacheKeyWillBeUsed".asInstanceOf[cacheKeyWillBeUsed]
    
    inline def CACHE_WILL_UPDATE: cacheWillUpdate = "cacheWillUpdate".asInstanceOf[cacheWillUpdate]
    
    inline def FETCH_DID_FAIL: fetchDidFail = "fetchDidFail".asInstanceOf[fetchDidFail]
    
    inline def FETCH_DID_SUCCEED: fetchDidSucceed = "fetchDidSucceed".asInstanceOf[fetchDidSucceed]
    
    inline def REQUEST_WILL_FETCH: requestWillFetch = "requestWillFetch".asInstanceOf[requestWillFetch]
  }
}

package typings.workboxPrecaching

import typings.workboxPrecaching.typesMod.PrecacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateCacheKeyMod {
  
  @JSImport("workbox-precaching/utils/createCacheKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCacheKey(entry: String): CacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKey")(entry.asInstanceOf[js.Any]).asInstanceOf[CacheKey]
  inline def createCacheKey(entry: PrecacheEntry): CacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createCacheKey")(entry.asInstanceOf[js.Any]).asInstanceOf[CacheKey]
  
  trait CacheKey extends StObject {
    
    var cacheKey: String
    
    var url: String
  }
  object CacheKey {
    
    inline def apply(cacheKey: String, url: String): CacheKey = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

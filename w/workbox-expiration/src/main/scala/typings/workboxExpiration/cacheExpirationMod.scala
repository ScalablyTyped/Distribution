package typings.workboxExpiration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheExpirationMod {
  
  @JSImport("workbox-expiration/CacheExpiration", "CacheExpiration")
  @js.native
  open class CacheExpiration protected () extends StObject {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
    
    def delete(): js.Promise[Unit] = js.native
    
    def expireEntries(): js.Promise[Unit] = js.native
    
    def isURLExpired(url: String): js.Promise[Boolean] = js.native
    
    def updateTimestamp(url: String): js.Promise[Unit] = js.native
  }
  
  trait CacheExpirationConfig extends StObject {
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
  }
  object CacheExpirationConfig {
    
    inline def apply(): CacheExpirationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheExpirationConfig]
    }
    
    extension [Self <: CacheExpirationConfig](x: Self) {
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
    }
  }
}

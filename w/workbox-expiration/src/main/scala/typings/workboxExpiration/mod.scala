package typings.workboxExpiration

import typings.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typings.workboxExpiration.pluginMod.ExpirationPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-expiration", "CacheExpiration")
  @js.native
  open class CacheExpiration protected ()
    extends typings.workboxExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @JSImport("workbox-expiration", "Plugin")
  @js.native
  open class Plugin ()
    extends typings.workboxExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
}

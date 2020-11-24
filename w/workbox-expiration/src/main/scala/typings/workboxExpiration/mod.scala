package typings.workboxExpiration

import typings.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typings.workboxExpiration.pluginMod.ExpirationPluginConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-expiration", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CacheExpiration protected ()
    extends typings.workboxExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typings.workboxExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
}

package typings.workboxDashExpiration

import typings.workboxDashExpiration.cacheExpirationMod.CacheExpirationConfig
import typings.workboxDashExpiration.pluginMod.ExpirationPluginConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration", JSImport.Namespace)
@js.native
object workboxDashExpirationMod extends js.Object {
  @js.native
  class CacheExpiration protected ()
    extends typings.workboxDashExpiration.cacheExpirationMod.CacheExpiration {
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
  }
  
  @js.native
  class Plugin ()
    extends typings.workboxDashExpiration.pluginMod.Plugin {
    def this(config: ExpirationPluginConfig) = this()
  }
  
}


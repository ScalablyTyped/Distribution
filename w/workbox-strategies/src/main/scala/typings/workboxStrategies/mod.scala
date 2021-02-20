package typings.workboxStrategies

import typings.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typings.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typings.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typings.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-strategies", "CacheFirst")
  @js.native
  class CacheFirst ()
    extends typings.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "CacheOnly")
  @js.native
  class CacheOnly ()
    extends typings.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkFirst")
  @js.native
  class NetworkFirst ()
    extends typings.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @JSImport("workbox-strategies", "NetworkOnly")
  @js.native
  class NetworkOnly ()
    extends typings.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @JSImport("workbox-strategies", "StaleWhileRevalidate")
  @js.native
  class StaleWhileRevalidate ()
    extends typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
}

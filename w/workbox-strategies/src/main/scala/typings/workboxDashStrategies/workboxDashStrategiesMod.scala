package typings.workboxDashStrategies

import typings.workboxDashStrategies.cacheFirstMod.CacheFirstOptions
import typings.workboxDashStrategies.cacheOnlyMod.CacheOnlyOptions
import typings.workboxDashStrategies.networkFirstMod.NetworkFirstOptions
import typings.workboxDashStrategies.networkOnlyMod.NetworkOnlyOptions
import typings.workboxDashStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-strategies", JSImport.Namespace)
@js.native
object workboxDashStrategiesMod extends js.Object {
  @js.native
  class CacheFirst ()
    extends typings.workboxDashStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @js.native
  class CacheOnly ()
    extends typings.workboxDashStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @js.native
  class NetworkFirst ()
    extends typings.workboxDashStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @js.native
  class NetworkOnly ()
    extends typings.workboxDashStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @js.native
  class StaleWhileRevalidate ()
    extends typings.workboxDashStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
  
}


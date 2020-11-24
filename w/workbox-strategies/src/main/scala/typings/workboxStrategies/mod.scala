package typings.workboxStrategies

import typings.workboxStrategies.cacheFirstMod.CacheFirstOptions
import typings.workboxStrategies.cacheOnlyMod.CacheOnlyOptions
import typings.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typings.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-strategies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CacheFirst ()
    extends typings.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: CacheFirstOptions) = this()
  }
  
  @js.native
  class CacheOnly ()
    extends typings.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: CacheOnlyOptions) = this()
  }
  
  @js.native
  class NetworkFirst ()
    extends typings.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  @js.native
  class NetworkOnly ()
    extends typings.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
  @js.native
  class StaleWhileRevalidate ()
    extends typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StaleWhileRevalidateOptions) = this()
  }
}

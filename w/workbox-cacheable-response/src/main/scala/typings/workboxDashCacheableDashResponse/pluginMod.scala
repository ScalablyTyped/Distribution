package typings.workboxDashCacheableDashResponse

import typings.std.Response
import typings.workboxDashCacheableDashResponse.cacheableResponseMod.CacheableResponseConfig
import typings.workboxDashCore.typesWorkboxPluginMod.CacheWillUpdateCallback
import typings.workboxDashCore.typesWorkboxPluginMod.CacheWillUpdateCallbackParamParam
import typings.workboxDashCore.typesWorkboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-cacheable-response/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  @js.native
  class Plugin () extends WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
  }
  
}


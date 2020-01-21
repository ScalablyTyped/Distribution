package typings.workboxCacheableResponse

import typings.std.Response
import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typings.workboxCore.workboxPluginMod.CacheWillUpdateCallback
import typings.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
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


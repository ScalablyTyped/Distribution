package typings.workboxCacheableResponse

import typings.std.Response
import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseConfig
import typings.workboxCore.workboxPluginMod.CacheWillUpdateCallback
import typings.workboxCore.workboxPluginMod.CacheWillUpdateCallbackParamParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-cacheable-response/Plugin", "Plugin")
  @js.native
  class Plugin ()
    extends StObject
       with WorkboxPlugin {
    def this(config: CacheableResponseConfig) = this()
    
    @JSName("cacheWillUpdate")
    def cacheWillUpdate_MPlugin(param: CacheWillUpdateCallbackParamParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cacheWillUpdate")
    var cacheWillUpdate_Original: CacheWillUpdateCallback = js.native
  }
}

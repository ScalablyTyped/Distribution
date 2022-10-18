package typings.workboxBroadcastUpdate

import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typings.workboxCore.typesWorkboxPluginMod.CacheDidUpdateCallback
import typings.workboxCore.typesWorkboxPluginMod.CacheDidUpdateCallbackParam
import typings.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-broadcast-update/Plugin", "Plugin")
  @js.native
  open class Plugin ()
    extends StObject
       with WorkboxPlugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
    
    @JSName("cacheDidUpdate")
    def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
    @JSName("cacheDidUpdate")
    var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
  }
}

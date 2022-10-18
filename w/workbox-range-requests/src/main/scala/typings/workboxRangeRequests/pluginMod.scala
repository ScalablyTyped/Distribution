package typings.workboxRangeRequests

import typings.std.Response
import typings.workboxCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.typesWorkboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.typesWorkboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-range-requests/Plugin", "Plugin")
  @js.native
  open class Plugin ()
    extends StObject
       with WorkboxPlugin {
    
    @JSName("cachedResponseWillBeUsed")
    def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cachedResponseWillBeUsed")
    var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  }
}

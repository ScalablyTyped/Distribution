package typings.workboxRangeRequests

import typings.std.Response
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-range-requests/Plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  
  @js.native
  class Plugin () extends WorkboxPlugin {
    
    @JSName("cachedResponseWillBeUsed")
    def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cachedResponseWillBeUsed")
    var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  }
}

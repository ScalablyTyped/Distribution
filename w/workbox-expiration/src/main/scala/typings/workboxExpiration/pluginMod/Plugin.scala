package typings.workboxExpiration.pluginMod

import typings.std.Response
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-expiration/Plugin", "Plugin")
@js.native
class Plugin () extends WorkboxPlugin {
  def this(config: ExpirationPluginConfig) = this()
  @JSName("cacheDidUpdate")
  var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
  @JSName("cachedResponseWillBeUsed")
  var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
  @JSName("cacheDidUpdate")
  def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
  @JSName("cachedResponseWillBeUsed")
  def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
  def deleteCacheAndMetadata(): js.Promise[Unit] = js.native
}


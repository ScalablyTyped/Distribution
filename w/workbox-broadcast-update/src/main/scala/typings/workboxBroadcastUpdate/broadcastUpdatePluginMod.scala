package typings.workboxBroadcastUpdate

import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastUpdatePluginMod {
  
  /**
    * This plugin will automatically broadcast a message whenever a cached response
    * is updated.
    *
    * @memberof workbox-broadcast-update
    */
  @JSImport("workbox-broadcast-update/BroadcastUpdatePlugin", "BroadcastUpdatePlugin")
  @js.native
  /**
    * Construct a {@link workbox-broadcast-update.BroadcastUpdate} instance with
    * the passed options and calls its `notifyIfUpdated` method whenever the
    * plugin's `cacheDidUpdate` callback is invoked.
    *
    * @param {Object} [options]
    * @param {Array<string>} [options.headersToCheck=['content-length', 'etag', 'last-modified']]
    *     A list of headers that will be used to determine whether the responses
    *     differ.
    * @param {string} [options.generatePayload] A function whose return value
    *     will be used as the `payload` field in any cache update messages sent
    *     to the window clients.
    */
  open class BroadcastUpdatePlugin ()
    extends StObject
       with WorkboxPlugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
    
    /* private */ val _broadcastUpdate: Any = js.native
  }
}

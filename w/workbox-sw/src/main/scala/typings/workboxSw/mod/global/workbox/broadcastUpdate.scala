package typings.workboxSw.mod.global.workbox

import typings.std.Response
import typings.workboxBroadcastUpdate.broadcastCacheUpdateMod.BroadcastCacheUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxBroadcastUpdate` */
object broadcastUpdate {
  
  @JSGlobal("workbox.broadcastUpdate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Uses the `postMessage()` API to inform any open windows/tabs when a cached
    * response has been updated.
    *
    * For efficiency's sake, the underlying response bodies are not compared;
    * only specific response headers are checked.
    *
    * @memberof workbox-broadcast-update
    */
  @JSGlobal("workbox.broadcastUpdate.BroadcastCacheUpdate")
  @js.native
  /**
    * Construct a BroadcastCacheUpdate instance with a specific `channelName` to
    * broadcast messages on
    *
    * @param {Object} [options]
    * @param {Array<string>} [options.headersToCheck=['content-length', 'etag', 'last-modified']]
    *     A list of headers that will be used to determine whether the responses
    *     differ.
    * @param {string} [options.generatePayload] A function whose return value
    *     will be used as the `payload` field in any cache update messages sent
    *     to the window clients.
    * @param {boolean} [options.notifyAllClients=true] If true (the default) then
    *     all open clients will receive a message. If false, then only the client
    *     that make the original request will be notified of the update.
    */
  open class BroadcastCacheUpdate ()
    extends typings.workboxBroadcastUpdate.mod.BroadcastCacheUpdate {
    def this(param0: BroadcastCacheUpdateOptions) = this()
  }
  
  /**
    * This plugin will automatically broadcast a message whenever a cached response
    * is updated.
    *
    * @memberof workbox-broadcast-update
    */
  @JSGlobal("workbox.broadcastUpdate.BroadcastUpdatePlugin")
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
    extends typings.workboxBroadcastUpdate.mod.BroadcastUpdatePlugin {
    def this(options: BroadcastCacheUpdateOptions) = this()
  }
  
  /**
    * Given two `Response's`, compares several header values to see if they are
    * the same or not.
    *
    * @param {Response} firstResponse
    * @param {Response} secondResponse
    * @param {Array<string>} headersToCheck
    * @return {boolean}
    *
    * @memberof workbox-broadcast-update
    */
  inline def responsesAreSame(firstResponse: Response, secondResponse: Response, headersToCheck: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("responsesAreSame")(firstResponse.asInstanceOf[js.Any], secondResponse.asInstanceOf[js.Any], headersToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

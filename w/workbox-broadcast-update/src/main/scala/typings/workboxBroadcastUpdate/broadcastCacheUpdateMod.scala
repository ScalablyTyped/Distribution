package typings.workboxBroadcastUpdate

import typings.std.Record
import typings.workboxCore.typesMod.CacheDidUpdateCallbackParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastCacheUpdateMod {
  
  /**
    * Uses the `postMessage()` API to inform any open windows/tabs when a cached
    * response has been updated.
    *
    * For efficiency's sake, the underlying response bodies are not compared;
    * only specific response headers are checked.
    *
    * @memberof workbox-broadcast-update
    */
  @JSImport("workbox-broadcast-update/BroadcastCacheUpdate", "BroadcastCacheUpdate")
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
  open class BroadcastCacheUpdate () extends StObject {
    def this(param0: BroadcastCacheUpdateOptions) = this()
    
    /* private */ val _generatePayload: Any = js.native
    
    /* private */ val _headersToCheck: Any = js.native
    
    /* private */ val _notifyAllClients: Any = js.native
    
    /**
      * Compares two [Responses](https://developer.mozilla.org/en-US/docs/Web/API/Response)
      * and sends a message (via `postMessage()`) to all window clients if the
      * responses differ. Neither of the Responses can be
      * [opaque](https://developer.chrome.com/docs/workbox/caching-resources-during-runtime/#opaque-responses).
      *
      * The message that's posted has the following format (where `payload` can
      * be customized via the `generatePayload` option the instance is created
      * with):
      *
      * ```
      * {
      *   type: 'CACHE_UPDATED',
      *   meta: 'workbox-broadcast-update',
      *   payload: {
      *     cacheName: 'the-cache-name',
      *     updatedURL: 'https://example.com/'
      *   }
      * }
      * ```
      *
      * @param {Object} options
      * @param {Response} [options.oldResponse] Cached response to compare.
      * @param {Response} options.newResponse Possibly updated response to compare.
      * @param {Request} options.request The request.
      * @param {string} options.cacheName Name of the cache the responses belong
      *     to. This is included in the broadcast message.
      * @param {Event} options.event event The event that triggered
      *     this possible cache update.
      * @return {Promise} Resolves once the update is sent.
      */
    def notifyIfUpdated(options: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
  }
  
  trait BroadcastCacheUpdateOptions extends StObject {
    
    var generatePayload: js.UndefOr[js.Function1[/* options */ CacheDidUpdateCallbackParam, Record[String, Any]]] = js.undefined
    
    var headersToCheck: js.UndefOr[js.Array[String]] = js.undefined
    
    var notifyAllClients: js.UndefOr[Boolean] = js.undefined
  }
  object BroadcastCacheUpdateOptions {
    
    inline def apply(): BroadcastCacheUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BroadcastCacheUpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BroadcastCacheUpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setGeneratePayload(value: /* options */ CacheDidUpdateCallbackParam => Record[String, Any]): Self = StObject.set(x, "generatePayload", js.Any.fromFunction1(value))
      
      inline def setGeneratePayloadUndefined: Self = StObject.set(x, "generatePayload", js.undefined)
      
      inline def setHeadersToCheck(value: js.Array[String]): Self = StObject.set(x, "headersToCheck", value.asInstanceOf[js.Any])
      
      inline def setHeadersToCheckUndefined: Self = StObject.set(x, "headersToCheck", js.undefined)
      
      inline def setHeadersToCheckVarargs(value: String*): Self = StObject.set(x, "headersToCheck", js.Array(value*))
      
      inline def setNotifyAllClients(value: Boolean): Self = StObject.set(x, "notifyAllClients", value.asInstanceOf[js.Any])
      
      inline def setNotifyAllClientsUndefined: Self = StObject.set(x, "notifyAllClients", js.undefined)
    }
  }
}

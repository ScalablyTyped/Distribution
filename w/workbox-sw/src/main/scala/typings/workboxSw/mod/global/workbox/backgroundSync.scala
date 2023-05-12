package typings.workboxSw.mod.global.workbox

import typings.std.Request
import typings.workboxBackgroundSync.libStorableRequestMod.RequestData
import typings.workboxBackgroundSync.queueMod.QueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxBackgroundSync` */
object backgroundSync {
  
  /**
    * A class implementing the `fetchDidFail` lifecycle callback. This makes it
    * easier to add failed requests to a background sync Queue.
    *
    * @memberof workbox-background-sync
    */
  @JSGlobal("workbox.backgroundSync.BackgroundSyncPlugin")
  @js.native
  open class BackgroundSyncPlugin protected ()
    extends typings.workboxBackgroundSync.mod.BackgroundSyncPlugin {
    /**
      * @param {string} name See the {@link workbox-background-sync.Queue}
      *     documentation for parameter details.
      * @param {Object} [options] See the
      *     {@link workbox-background-sync.Queue} documentation for
      *     parameter details.
      */
    def this(name: String) = this()
    def this(name: String, options: QueueOptions) = this()
  }
  
  /**
    * A class to manage storing failed requests in IndexedDB and retrying them
    * later. All parts of the storing and replaying process are observable via
    * callbacks.
    *
    * @memberof workbox-background-sync
    */
  @JSGlobal("workbox.backgroundSync.Queue")
  @js.native
  open class Queue protected ()
    extends typings.workboxBackgroundSync.mod.Queue {
    /**
      * Creates an instance of Queue with the given options
      *
      * @param {string} name The unique name for this queue. This name must be
      *     unique as it's used to register sync events and store requests
      *     in IndexedDB specific to this instance. An error will be thrown if
      *     a duplicate name is detected.
      * @param {Object} [options]
      * @param {Function} [options.onSync] A function that gets invoked whenever
      *     the 'sync' event fires. The function is invoked with an object
      *     containing the `queue` property (referencing this instance), and you
      *     can use the callback to customize the replay behavior of the queue.
      *     When not set the `replayRequests()` method is called.
      *     Note: if the replay fails after a sync event, make sure you throw an
      *     error, so the browser knows to retry the sync event later.
      * @param {number} [options.maxRetentionTime=7 days] The amount of time (in
      *     minutes) a request may be retried. After this amount of time has
      *     passed, the request will be deleted from the queue.
      * @param {boolean} [options.forceSyncFallback=false] If `true`, instead
      *     of attempting to use background sync events, always attempt to replay
      *     queued request at service worker startup. Most folks will not need
      *     this, unless you explicitly target a runtime like Electron that
      *     exposes the interfaces for background sync, but does not have a working
      *     implementation.
      */
    def this(name: String) = this()
    def this(name: String, param1: QueueOptions) = this()
  }
  
  @JSGlobal("workbox.backgroundSync.QueueStore")
  @js.native
  open class QueueStore protected ()
    extends typings.workboxBackgroundSync.mod.QueueStore {
    /**
      * Associates this instance with a Queue instance, so entries added can be
      * identified by their queue name.
      *
      * @param {string} queueName
      */
    def this(queueName: String) = this()
  }
  
  /**
    * A class to make it easier to serialize and de-serialize requests so they
    * can be stored in IndexedDB.
    *
    * Most developers will not need to access this class directly;
    * it is exposed for advanced use cases.
    */
  @JSGlobal("workbox.backgroundSync.StorableRequest")
  @js.native
  open class StorableRequest protected ()
    extends typings.workboxBackgroundSync.mod.StorableRequest {
    /**
      * Accepts an object of request data that can be used to construct a
      * `Request` but can also be stored in IndexedDB.
      *
      * @param {Object} requestData An object of request data that includes the
      *     `url` plus any relevant properties of
      *     [requestInit]{@link https://fetch.spec.whatwg.org/#requestinit}.
      */
    def this(requestData: RequestData) = this()
  }
  object StorableRequest {
    
    @JSGlobal("workbox.backgroundSync.StorableRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a Request object to a plain object that can be structured
      * cloned or JSON-stringified.
      *
      * @param {Request} request
      * @return {Promise<StorableRequest>}
      */
    /* static member */
    inline def fromRequest(request: Request): js.Promise[typings.workboxBackgroundSync.libStorableRequestMod.StorableRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRequest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.workboxBackgroundSync.libStorableRequestMod.StorableRequest]]
  }
}

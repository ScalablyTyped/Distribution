package typings.workboxBackgroundSync

import typings.std.Request
import typings.workboxBackgroundSync.workboxBackgroundSyncStrings.pop
import typings.workboxBackgroundSync.workboxBackgroundSyncStrings.push
import typings.workboxBackgroundSync.workboxBackgroundSyncStrings.shift
import typings.workboxBackgroundSync.workboxBackgroundSyncStrings.unshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  /**
    * A class to manage storing failed requests in IndexedDB and retrying them
    * later. All parts of the storing and replaying process are observable via
    * callbacks.
    *
    * @memberof workbox-background-sync
    */
  @JSImport("workbox-background-sync/Queue", "Queue")
  @js.native
  open class Queue protected () extends StObject {
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
    
    /**
      * Adds the entry to the QueueStore and registers for a sync event.
      *
      * @param {Object} entry
      * @param {Request} entry.request
      * @param {Object} [entry.metadata]
      * @param {number} [entry.timestamp=Date.now()]
      * @param {string} operation ('push' or 'unshift')
      * @private
      */
    def _addRequest(param0: QueueEntry, operation: push | unshift): js.Promise[Unit] = js.native
    
    /**
      * In sync-supporting browsers, this adds a listener for the sync event.
      * In non-sync-supporting browsers, or if _forceSyncFallback is true, this
      * will retry the queue on service worker startup.
      *
      * @private
      */
    /* private */ var _addSyncListener: Any = js.native
    
    /* private */ val _forceSyncFallback: Any = js.native
    
    /* private */ val _maxRetentionTime: Any = js.native
    
    /* private */ val _name: Any = js.native
    
    /* private */ val _onSync: Any = js.native
    
    /* private */ val _queueStore: Any = js.native
    
    /**
      * Removes and returns the first or last (depending on `operation`) entry
      * from the QueueStore that's not older than the `maxRetentionTime`.
      *
      * @param {string} operation ('pop' or 'shift')
      * @return {Object|undefined}
      * @private
      */
    def _removeRequest(operation: pop | shift): js.Promise[js.UndefOr[QueueEntry]] = js.native
    
    /* private */ var _requestsAddedDuringSync: Any = js.native
    
    /* private */ var _syncInProgress: Any = js.native
    
    /**
      * Returns all the entries that have not expired (per `maxRetentionTime`).
      * Any expired entries are removed from the queue.
      *
      * @return {Promise<Array<QueueEntry>>}
      */
    def getAll(): js.Promise[js.Array[QueueEntry]] = js.native
    
    /**
      * @return {string}
      */
    def name: String = js.native
    
    /**
      * Removes and returns the last request in the queue (along with its
      * timestamp and any metadata). The returned object takes the form:
      * `{request, timestamp, metadata}`.
      *
      * @return {Promise<QueueEntry | undefined>}
      */
    def popRequest(): js.Promise[js.UndefOr[QueueEntry]] = js.native
    
    /**
      * Stores the passed request in IndexedDB (with its timestamp and any
      * metadata) at the end of the queue.
      *
      * @param {QueueEntry} entry
      * @param {Request} entry.request The request to store in the queue.
      * @param {Object} [entry.metadata] Any metadata you want associated with the
      *     stored request. When requests are replayed you'll have access to this
      *     metadata object in case you need to modify the request beforehand.
      * @param {number} [entry.timestamp] The timestamp (Epoch time in
      *     milliseconds) when the request was first added to the queue. This is
      *     used along with `maxRetentionTime` to remove outdated requests. In
      *     general you don't need to set this value, as it's automatically set
      *     for you (defaulting to `Date.now()`), but you can update it if you
      *     don't want particular requests to expire.
      */
    def pushRequest(entry: QueueEntry): js.Promise[Unit] = js.native
    
    /**
      * Registers a sync event with a tag unique to this instance.
      */
    def registerSync(): js.Promise[Unit] = js.native
    
    /**
      * Loops through each request in the queue and attempts to re-fetch it.
      * If any request fails to re-fetch, it's put back in the same position in
      * the queue (which registers a retry for the next sync event).
      */
    def replayRequests(): js.Promise[Unit] = js.native
    
    /**
      * Removes and returns the first request in the queue (along with its
      * timestamp and any metadata). The returned object takes the form:
      * `{request, timestamp, metadata}`.
      *
      * @return {Promise<QueueEntry | undefined>}
      */
    def shiftRequest(): js.Promise[js.UndefOr[QueueEntry]] = js.native
    
    /**
      * Returns the number of entries present in the queue.
      * Note that expired entries (per `maxRetentionTime`) are also included in this count.
      *
      * @return {Promise<number>}
      */
    def size(): js.Promise[Double] = js.native
    
    /**
      * Stores the passed request in IndexedDB (with its timestamp and any
      * metadata) at the beginning of the queue.
      *
      * @param {QueueEntry} entry
      * @param {Request} entry.request The request to store in the queue.
      * @param {Object} [entry.metadata] Any metadata you want associated with the
      *     stored request. When requests are replayed you'll have access to this
      *     metadata object in case you need to modify the request beforehand.
      * @param {number} [entry.timestamp] The timestamp (Epoch time in
      *     milliseconds) when the request was first added to the queue. This is
      *     used along with `maxRetentionTime` to remove outdated requests. In
      *     general you don't need to set this value, as it's automatically set
      *     for you (defaulting to `Date.now()`), but you can update it if you
      *     don't want particular requests to expire.
      */
    def unshiftRequest(entry: QueueEntry): js.Promise[Unit] = js.native
  }
  
  type OnSyncCallback = js.Function1[/* options */ OnSyncCallbackOptions, Unit | js.Promise[Unit]]
  
  trait OnSyncCallbackOptions extends StObject {
    
    var queue: Queue
  }
  object OnSyncCallbackOptions {
    
    inline def apply(queue: Queue): OnSyncCallbackOptions = {
      val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSyncCallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnSyncCallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setQueue(value: Queue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueEntry extends StObject {
    
    var metadata: js.UndefOr[js.Object] = js.undefined
    
    var request: Request
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object QueueEntry {
    
    inline def apply(request: Request): QueueEntry = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueEntry] (val x: Self) extends AnyVal {
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait QueueOptions extends StObject {
    
    var forceSyncFallback: js.UndefOr[Boolean] = js.undefined
    
    var maxRetentionTime: js.UndefOr[Double] = js.undefined
    
    var onSync: js.UndefOr[OnSyncCallback] = js.undefined
  }
  object QueueOptions {
    
    inline def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueOptions] (val x: Self) extends AnyVal {
      
      inline def setForceSyncFallback(value: Boolean): Self = StObject.set(x, "forceSyncFallback", value.asInstanceOf[js.Any])
      
      inline def setForceSyncFallbackUndefined: Self = StObject.set(x, "forceSyncFallback", js.undefined)
      
      inline def setMaxRetentionTime(value: Double): Self = StObject.set(x, "maxRetentionTime", value.asInstanceOf[js.Any])
      
      inline def setMaxRetentionTimeUndefined: Self = StObject.set(x, "maxRetentionTime", js.undefined)
      
      inline def setOnSync(value: /* options */ OnSyncCallbackOptions => Unit | js.Promise[Unit]): Self = StObject.set(x, "onSync", js.Any.fromFunction1(value))
      
      inline def setOnSyncUndefined: Self = StObject.set(x, "onSync", js.undefined)
    }
  }
}

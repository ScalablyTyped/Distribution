package typings.workboxBackgroundSync

import typings.std.Request
import typings.workboxBackgroundSync.libStorableRequestMod.RequestData
import typings.workboxBackgroundSync.queueMod.QueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A class implementing the `fetchDidFail` lifecycle callback. This makes it
    * easier to add failed requests to a background sync Queue.
    *
    * @memberof workbox-background-sync
    */
  @JSImport("workbox-background-sync", "BackgroundSyncPlugin")
  @js.native
  open class BackgroundSyncPlugin protected ()
    extends typings.workboxBackgroundSync.backgroundSyncPluginMod.BackgroundSyncPlugin {
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
  @JSImport("workbox-background-sync", "Queue")
  @js.native
  open class Queue protected ()
    extends typings.workboxBackgroundSync.queueMod.Queue {
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
  
  @JSImport("workbox-background-sync", "QueueStore")
  @js.native
  open class QueueStore protected ()
    extends typings.workboxBackgroundSync.queueStoreMod.QueueStore {
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
  @JSImport("workbox-background-sync", "StorableRequest")
  @js.native
  open class StorableRequest protected ()
    extends typings.workboxBackgroundSync.storableRequestMod.StorableRequest {
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
    
    @JSImport("workbox-background-sync", "StorableRequest")
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
  
  trait SyncManager extends StObject {
    
    def getTags(): js.Promise[js.Array[String]]
    
    def register(tag: String): js.Promise[Unit]
  }
  object SyncManager {
    
    inline def apply(getTags: () => js.Promise[js.Array[String]], register: String => js.Promise[Unit]): SyncManager = {
      val __obj = js.Dynamic.literal(getTags = js.Any.fromFunction0(getTags), register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[SyncManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncManager] (val x: Self) extends AnyVal {
      
      inline def setGetTags(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getTags", js.Any.fromFunction0(value))
      
      inline def setRegister(value: String => js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    trait ServiceWorkerGlobalScopeEventMap extends StObject {
      
      var sync: SyncEvent
    }
    object ServiceWorkerGlobalScopeEventMap {
      
      inline def apply(sync: SyncEvent): ServiceWorkerGlobalScopeEventMap = {
        val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceWorkerGlobalScopeEventMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServiceWorkerGlobalScopeEventMap] (val x: Self) extends AnyVal {
        
        inline def setSync(value: SyncEvent): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServiceWorkerRegistration extends StObject {
      
      val sync: SyncManager
    }
    object ServiceWorkerRegistration {
      
      inline def apply(sync: SyncManager): ServiceWorkerRegistration = {
        val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceWorkerRegistration]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServiceWorkerRegistration] (val x: Self) extends AnyVal {
        
        inline def setSync(value: SyncManager): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent * / any */ trait SyncEvent extends StObject {
      
      val lastChance: Boolean
      
      val tag: String
    }
    object SyncEvent {
      
      inline def apply(lastChance: Boolean, tag: String): SyncEvent = {
        val __obj = js.Dynamic.literal(lastChance = lastChance.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[SyncEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SyncEvent] (val x: Self) extends AnyVal {
        
        inline def setLastChance(value: Boolean): Self = StObject.set(x, "lastChance", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      }
    }
  }
}

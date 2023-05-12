package typings.workboxSw.mod.global.workbox

import typings.std.Cache
import typings.std.CacheQueryOptions
import typings.std.Console
import typings.std.Request
import typings.std.Response
import typings.std.ResponseInit
import typings.std.URL
import typings.workboxCore.anon.HasMethod
import typings.workboxCore.privateCacheNamesMod.PartialCacheNameDetails
import typings.workboxCore.typesMod.MapLikeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxCore` */
object core {
  
  @JSGlobal("workbox.core")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the current cache names and prefix/suffix used by Workbox.
    *
    * `cacheNames.precache` is used for precached assets,
    * `cacheNames.googleAnalytics` is used by `workbox-google-analytics` to
    * store `analytics.js`, and `cacheNames.runtime` is used for everything else.
    *
    * `cacheNames.prefix` can be used to retrieve just the current prefix value.
    * `cacheNames.suffix` can be used to retrieve just the current suffix value.
    *
    * @return {Object} An object with `precache`, `runtime`, `prefix`, and
    *     `googleAnalytics` properties.
    *
    * @memberof workbox-core
    */
  object cacheNames {
    
    @JSGlobal("workbox.core.cacheNames.googleAnalytics")
    @js.native
    val googleAnalytics: String = js.native
    
    @JSGlobal("workbox.core.cacheNames.precache")
    @js.native
    val precache: String = js.native
    
    @JSGlobal("workbox.core.cacheNames.prefix")
    @js.native
    val prefix: String = js.native
    
    @JSGlobal("workbox.core.cacheNames.runtime")
    @js.native
    val runtime: String = js.native
    
    @JSGlobal("workbox.core.cacheNames.suffix")
    @js.native
    val suffix: String = js.native
  }
  
  /**
    * Claim any currently available clients once the service worker
    * becomes active. This is normally used in conjunction with `skipWaiting()`.
    *
    * @memberof workbox-core
    */
  inline def clientsClaim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clientsClaim")().asInstanceOf[Unit]
  
  /**
    * Allows developers to copy a response and modify its `headers`, `status`,
    * or `statusText` values (the values settable via a
    * [`ResponseInit`]{@link https://developer.mozilla.org/en-US/docs/Web/API/Response/Response#Syntax}
    * object in the constructor).
    * To modify these values, pass a function as the second argument. That
    * function will be invoked with a single object with the response properties
    * `{headers, status, statusText}`. The return value of this function will
    * be used as the `ResponseInit` for the new `Response`. To change the values
    * either modify the passed parameter(s) and return it, or return a totally
    * new object.
    *
    * This method is intentionally limited to same-origin responses, regardless of
    * whether CORS was used or not.
    *
    * @param {Response} response
    * @param {Function} modifier
    * @memberof workbox-core
    */
  inline def copyResponse(response: Response): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def copyResponse(response: Response, modifier: js.Function1[/* responseInit */ ResponseInit, ResponseInit]): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyResponse")(response.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  object `private` {
    
    @JSGlobal("workbox.core._private")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The Deferred class composes Promises in a way that allows for them to be
      * resolved or rejected from outside the constructor. In most cases promises
      * should be used directly, but Deferreds can be necessary when the logic to
      * resolve a promise must be separate.
      *
      * @private
      */
    @JSGlobal("workbox.core._private.Deferred")
    @js.native
    /**
      * Creates a promise and exposes its resolve and reject functions as methods.
      */
    open class Deferred[T] ()
      extends typings.workboxCore.mod.`private`.Deferred[T]
    
    /**
      * Workbox errors should be thrown with this class.
      * This allows use to ensure the type easily in tests,
      * helps developers identify errors from workbox
      * easily and allows use to optimise error
      * messages correctly.
      *
      * @private
      */
    @JSGlobal("workbox.core._private.WorkboxError")
    @js.native
    open class WorkboxError protected ()
      extends typings.workboxCore.mod.`private`.WorkboxError {
      /**
        *
        * @param {string} errorCode The error code that
        * identifies this particular error.
        * @param {Object=} details Any relevant arguments
        * that will help developers identify issues should
        * be added as a key on the context object.
        */
      def this(errorCode: String) = this()
      def this(errorCode: String, details: MapLikeObject) = this()
    }
    
    @JSGlobal("workbox.core._private.assert")
    @js.native
    val assert: HasMethod | Null = js.native
    
    /**
      * Matches an item in the cache, ignoring specific URL params. This is similar
      * to the `ignoreSearch` option, but it allows you to ignore just specific
      * params (while continuing to match on the others).
      *
      * @private
      * @param {Cache} cache
      * @param {Request} request
      * @param {Object} matchOptions
      * @param {Array<string>} ignoreParams
      * @return {Promise<Response|undefined>}
      */
    inline def cacheMatchIgnoreParams(cache: Cache, request: Request, ignoreParams: js.Array[String]): js.Promise[js.UndefOr[Response]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheMatchIgnoreParams")(cache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], ignoreParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Response]]]
    inline def cacheMatchIgnoreParams(cache: Cache, request: Request, ignoreParams: js.Array[String], matchOptions: CacheQueryOptions): js.Promise[js.UndefOr[Response]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheMatchIgnoreParams")(cache.asInstanceOf[js.Any], request.asInstanceOf[js.Any], ignoreParams.asInstanceOf[js.Any], matchOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Response]]]
    
    object cacheNames {
      
      @JSGlobal("workbox.core._private.cacheNames")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getGoogleAnalyticsName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleAnalyticsName")().asInstanceOf[String]
      inline def getGoogleAnalyticsName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGoogleAnalyticsName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getPrecacheName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecacheName")().asInstanceOf[String]
      inline def getPrecacheName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrecacheName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getPrefix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")().asInstanceOf[String]
      
      inline def getRuntimeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeName")().asInstanceOf[String]
      inline def getRuntimeName(userCacheName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeName")(userCacheName.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getSuffix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuffix")().asInstanceOf[String]
      
      inline def updateDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * A utility function that determines whether the current browser supports
      * constructing a [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream)
      * object.
      *
      * @return {boolean} `true`, if the current browser can successfully
      *     construct a `ReadableStream`, `false` otherwise.
      *
      * @private
      */
    inline def canConstructReadableStream(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canConstructReadableStream")().asInstanceOf[Boolean]
    
    /**
      * A utility function that determines whether the current browser supports
      * constructing a new `Response` from a `response.body` stream.
      *
      * @return {boolean} `true`, if the current browser can successfully
      *     construct a `Response` from a `response.body` stream, `false` otherwise.
      *
      * @private
      */
    inline def canConstructResponseFromBodyStream(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canConstructResponseFromBodyStream")().asInstanceOf[Boolean]
    
    inline def dontWaitFor(promise: js.Promise[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dontWaitFor")(promise.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Runs all of the callback functions, one at a time sequentially, in the order
      * in which they were registered.
      *
      * @memberof workbox-core
      * @private
      */
    inline def executeQuotaErrorCallbacks(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeQuotaErrorCallbacks")().asInstanceOf[js.Promise[Unit]]
    
    inline def getFriendlyURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getFriendlyURL(url: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFriendlyURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("workbox.core._private.logger")
    @js.native
    val logger: Console = js.native
    
    inline def resultingClientExists(): js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("resultingClientExists")().asInstanceOf[js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
        ]
      ]]
    inline def resultingClientExists(resultingClientId: String): js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("resultingClientExists")(resultingClientId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
        ]
      ]]
    
    inline def timeout(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    /**
      * A utility method that makes it easier to use `event.waitUntil` with
      * async functions and return the result.
      *
      * @param {ExtendableEvent} event
      * @param {Function} asyncFn
      * @return {Function}
      * @private
      */
    inline def waitUntil(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any,
      asyncFn: js.Function0[js.Promise[Any]]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(event.asInstanceOf[js.Any], asyncFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  /**
    * Adds a function to the set of quotaErrorCallbacks that will be executed if
    * there's a quota error.
    *
    * @param {Function} callback
    * @memberof workbox-core
    */
  inline def registerQuotaErrorCallback(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQuotaErrorCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Modifies the default cache names used by the Workbox packages.
    * Cache names are generated as `<prefix>-<Cache Name>-<suffix>`.
    *
    * @param {Object} details
    * @param {Object} [details.prefix] The string to add to the beginning of
    *     the precache and runtime cache names.
    * @param {Object} [details.suffix] The string to add to the end of
    *     the precache and runtime cache names.
    * @param {Object} [details.precache] The cache name to use for precache
    *     caching.
    * @param {Object} [details.runtime] The cache name to use for runtime caching.
    * @param {Object} [details.googleAnalytics] The cache name to use for
    *     `workbox-google-analytics` caching.
    *
    * @memberof workbox-core
    */
  inline def setCacheNameDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheNameDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * This method is deprecated, and will be removed in Workbox v7.
    *
    * Calling self.skipWaiting() is equivalent, and should be used instead.
    *
    * @memberof workbox-core
    */
  inline def skipWaiting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWaiting")().asInstanceOf[Unit]
}

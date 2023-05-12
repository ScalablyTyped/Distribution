package typings.workboxCore

import typings.std.Cache
import typings.std.CacheQueryOptions
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateCacheMatchIgnoreParamsMod {
  
  @JSImport("workbox-core/_private/cacheMatchIgnoreParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}

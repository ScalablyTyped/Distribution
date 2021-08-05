package typings.wordpressApiFetch.mod

import typings.std.Record
import typings.std.Response
import typings.wordpressApiFetch.anon.APIFetchOptionsparsefalse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  inline def apply(options: APIFetchOptionsparsefalse): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def apply[T](options: APIFetchOptions): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @JSImport("@wordpress/api-fetch", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  //
  // Built-in middleware
  //
  /**
    * The function returned by `createNonceMiddleware` includes a `nonce` property
    * corresponding to the actively used nonce. You may also assign to this
    * property if you have a fresh nonce value to use.
    */
  inline def createNonceMiddleware(nonce: String): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonceMiddleware")(nonce.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def createPreloadingMiddleware(data: Record[String, js.Any]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("createPreloadingMiddleware")(data.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  inline def createRootURLMiddleware(rootUrl: String): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("createRootURLMiddleware")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  
  @JSImport("@wordpress/api-fetch", "default.fetchAllMiddleware")
  @js.native
  val fetchAllMiddleware: Middleware = js.native
  
  /**
    * The `api-fetch` package uses `window.fetch` for making the requests but you
    * can use a custom fetch handler by using the `setFetchHandler` method. The
    * custom fetch handler will receive the `options` passed to the `apiFetch`
    * calls.
    */
  inline def setFetchHandler(handler: js.Function1[/* options */ APIFetchOptions, js.Thenable[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFetchHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def use(middleware: Middleware): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(middleware.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.wordpressApiFetch.mod

import typings.std.Record
import typings.std.Response
import typings.wordpressApiFetch.anon.APIFetchOptionsparsefalse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("@wordpress/api-fetch", JSImport.Default)
  @js.native
  def apply(options: APIFetchOptionsparsefalse): js.Promise[Response] = js.native
  @JSImport("@wordpress/api-fetch", JSImport.Default)
  @js.native
  def apply[T](options: APIFetchOptions): js.Promise[T] = js.native
  
  //
  // Built-in middleware
  //
  /**
    * The function returned by `createNonceMiddleware` includes a `nonce` property
    * corresponding to the actively used nonce. You may also assign to this
    * property if you have a fresh nonce value to use.
    */
  @JSImport("@wordpress/api-fetch", "default.createNonceMiddleware")
  @js.native
  def createNonceMiddleware(nonce: String): Middleware = js.native
  
  @JSImport("@wordpress/api-fetch", "default.createPreloadingMiddleware")
  @js.native
  def createPreloadingMiddleware(data: Record[String, _]): Middleware = js.native
  
  @JSImport("@wordpress/api-fetch", "default.createRootURLMiddleware")
  @js.native
  def createRootURLMiddleware(rootUrl: String): Middleware = js.native
  
  @JSImport("@wordpress/api-fetch", "default.fetchAllMiddleware")
  @js.native
  val fetchAllMiddleware: Middleware = js.native
  
  /**
    * The `api-fetch` package uses `window.fetch` for making the requests but you
    * can use a custom fetch handler by using the `setFetchHandler` method. The
    * custom fetch handler will receive the `options` passed to the `apiFetch`
    * calls.
    */
  @JSImport("@wordpress/api-fetch", "default.setFetchHandler")
  @js.native
  def setFetchHandler(handler: js.Function1[/* options */ APIFetchOptions, js.Thenable[_]]): Unit = js.native
  
  @JSImport("@wordpress/api-fetch", "default.use")
  @js.native
  def use(middleware: Middleware): Unit = js.native
}

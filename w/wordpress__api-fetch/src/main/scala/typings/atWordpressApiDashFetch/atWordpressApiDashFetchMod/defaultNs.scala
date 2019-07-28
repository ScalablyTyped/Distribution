package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/api-fetch", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  val fetchAllMiddleware: Middleware = js.native
  //
  // Built-in middleware
  //
  /**
    * The function returned by `createNonceMiddleware` includes a `nonce` property
    * corresponding to the actively used nonce. You may also assign to this
    * property if you have a fresh nonce value to use.
    */
  def createNonceMiddleware(nonce: String): Middleware = js.native
  def createPreloadingMiddleware(data: Record[String, _]): Middleware = js.native
  def createRootURLMiddleware(rootUrl: String): Middleware = js.native
  /**
    * The `api-fetch` package uses `window.fetch` for making the requests but you
    * can use a custom fetch handler by using the `setFetchHandler` method. The
    * custom fetch handler will receive the `options` passed to the `apiFetch`
    * calls.
    */
  def setFetchHandler(handler: js.Function1[/* options */ APIFetchOptions, js.Thenable[_]]): Unit = js.native
  def use(middleware: Middleware): Unit = js.native
}


package typings.workboxSw.mod.global.workbox

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxRangeRequests` */
object rangeRequests {
  
  @JSGlobal("workbox.rangeRequests")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The range request plugin makes it easy for a request with a 'Range' header to
    * be fulfilled by a cached response.
    *
    * It does this by intercepting the `cachedResponseWillBeUsed` plugin callback
    * and returning the appropriate subset of the cached response body.
    *
    * @memberof workbox-range-requests
    */
  @JSGlobal("workbox.rangeRequests.RangeRequestsPlugin")
  @js.native
  open class RangeRequestsPlugin ()
    extends typings.workboxRangeRequests.mod.RangeRequestsPlugin
  
  /**
    * Given a `Request` and `Response` objects as input, this will return a
    * promise for a new `Response`.
    *
    * If the original `Response` already contains partial content (i.e. it has
    * a status of 206), then this assumes it already fulfills the `Range:`
    * requirements, and will return it as-is.
    *
    * @param {Request} request A request, which should contain a Range:
    * header.
    * @param {Response} originalResponse A response.
    * @return {Promise<Response>} Either a `206 Partial Content` response, with
    * the response body set to the slice of content specified by the request's
    * `Range:` header, or a `416 Range Not Satisfiable` response if the
    * conditions of the `Range:` header can't be met.
    *
    * @memberof workbox-range-requests
    */
  inline def createPartialResponse(request: Request, originalResponse: Response): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartialResponse")(request.asInstanceOf[js.Any], originalResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}

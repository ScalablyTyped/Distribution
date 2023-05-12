package typings.workboxCore

import typings.std.Response
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyResponseMod {
  
  @JSImport("workbox-core/copyResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}

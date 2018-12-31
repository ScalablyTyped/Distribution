package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonParseOptionItem extends js.Object {
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * passed to JSON.parse().
    */
  var receiver: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  /**
    * only parse objects and arrays. (default: true)
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like json), a mime type (like application/json), or a mime * type with a wildcard (like * / * or * /json).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to application/json
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]) | java.lang.String
  ] = js.undefined
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding), where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    * The parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ Response, 
      /* buf */ nodeLib.Buffer, 
      /* encoding */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
}


package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParseRequestOptions extends js.Object {
  /**
               * Cookie parser options
               */
  var cookie: js.UndefOr[CookieParserOptionItem] = js.undefined
  /**
               * JSON body parser options
               */
  var json: js.UndefOr[JsonParseOptionItem] = js.undefined
  /**
               * Multipart form data parser options
               */
  var multipart: js.UndefOr[MulterOptions] = js.undefined
  /**
               * Raw body parser options
               */
  var raw: js.UndefOr[RawParserOptionItem] = js.undefined
  /**
               * Plain-text body parser options
               */
  var text: js.UndefOr[TextParserOptionItem] = js.undefined
  /**
               * URL-encoded body parser options
               */
  var urlencoded: js.UndefOr[UrlEncodedOptionItem] = js.undefined
}


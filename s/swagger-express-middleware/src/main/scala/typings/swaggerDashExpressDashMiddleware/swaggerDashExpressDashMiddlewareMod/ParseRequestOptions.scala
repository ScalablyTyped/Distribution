package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

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

object ParseRequestOptions {
  @scala.inline
  def apply(
    cookie: CookieParserOptionItem = null,
    json: JsonParseOptionItem = null,
    multipart: MulterOptions = null,
    raw: RawParserOptionItem = null,
    text: TextParserOptionItem = null,
    urlencoded: UrlEncodedOptionItem = null
  ): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseRequestOptions]
  }
}


package typings
package swaggerDashExpressDashMiddlewareLib.swaggerDashExpressDashMiddlewareMod.sNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextParserOptionItem extends js.Object {
  /**
    * the default charset to parse as, if not specified in content-type. (default: 'utf-8')
    */
  var defaultCharset: js.UndefOr[java.lang.String] = js.undefined
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
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like txt), a mime type (like text/plain), or a mime type * with a wildcard (like * / * or text/ *).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to text/plain.
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]) | java.lang.String
  ] = js.undefined
  /**
    * function to verify body content, the parsing can be aborted by throwing an error.
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

object TextParserOptionItem {
  @scala.inline
  def apply(
    defaultCharset: java.lang.String = null,
    inflate: js.UndefOr[scala.Boolean] = js.undefined,
    limit: java.lang.String | scala.Double = null,
    `type`: (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]) | java.lang.String = null,
    verify: (/* req */ expressLib.expressMod.eNs.Request, /* res */ Response, /* buf */ nodeLib.Buffer, /* encoding */ java.lang.String) => scala.Unit = null
  ): TextParserOptionItem = {
    val __obj = js.Dynamic.literal()
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset)
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    __obj.asInstanceOf[TextParserOptionItem]
  }
}


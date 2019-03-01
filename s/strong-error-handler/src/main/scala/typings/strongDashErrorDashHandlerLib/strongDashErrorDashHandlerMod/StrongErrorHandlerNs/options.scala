package typings
package strongDashErrorDashHandlerLib.strongDashErrorDashHandlerMod.StrongErrorHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends js.Object {
  /***
    * HTTP responses include all error properties, including sensitive data such as file paths,
    * URLs and stack traces, defaults to false.
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Specify the default response content type to use when the client does not provide any Accepts header.
    * Defaults to 'json'.
    */
  var defaultType: js.UndefOr[java.lang.String] = js.undefined
  /***
    *If true, all errors are printed via console.error, including an array of fields (custom error properties)
    *that are safe to include in response messages (both 4xx and 5xx).
    *If false, sends only the error back in the response.
    * Defaults to true
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Negotiate the response content type via Accepts request header.
    * When disabled, strong-error-handler will always use the default content type when producing responses.
    * Disabling content type negotiation is useful if you want to see JSON-formatted
    * error responses in browsers, because browsers usually prefer HTML and XML over other content types.
    */
  var negotiateContentType: js.UndefOr[scala.Boolean] = js.undefined
  /***
    * Specifies property names on errors that are allowed to be passed through in 4xx and 5xx responses.
    */
  var safeFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object options {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaultType: java.lang.String = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    negotiateContentType: js.UndefOr[scala.Boolean] = js.undefined,
    safeFields: js.Array[java.lang.String] = null
  ): options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(negotiateContentType)) __obj.updateDynamic("negotiateContentType")(negotiateContentType)
    if (safeFields != null) __obj.updateDynamic("safeFields")(safeFields)
    __obj.asInstanceOf[options]
  }
}


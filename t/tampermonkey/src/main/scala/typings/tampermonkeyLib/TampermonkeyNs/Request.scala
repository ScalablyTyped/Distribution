package typings
package tampermonkeyLib.TampermonkeyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request[TContext] extends js.Object {
  /** Don't send cookies with the requests (please see the fetch notes) */
  var anonymous: js.UndefOr[scala.Boolean] = js.undefined
  /** Send the data string in binary mode */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /** Property which will be added to the response object */
  var context: js.UndefOr[TContext] = js.undefined
  /** String to send via a POST request */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (Beta) Use a fetch instead of a xhr request(at Chrome this causes
    * `xhr.abort`, `details.timeout` and `xhr.onprogress` to not work and
    * makes `xhr.onreadystatechange` receive only readyState 4 events)
    */
  var fetch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * i.e. user-agent, referer... (some special headers are not supported
    * by Safari and Android browsers)
    */
  var headers: js.UndefOr[RequestHeaders] = js.undefined
  var method: js.UndefOr[
    tampermonkeyLib.tampermonkeyLibStrings.GET | tampermonkeyLib.tampermonkeyLibStrings.HEAD | tampermonkeyLib.tampermonkeyLibStrings.POST
  ] = js.undefined
  // Events
  /** Callback to be executed if the request was aborted */
  var onabort: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Callback to be executed if the request ended up with an error */
  var onerror: js.UndefOr[RequestEventListener[ErrorResponse]] = js.undefined
  /** Callback to be executed if the request was loaded */
  var onload: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  /** Callback to be executed if the request started to load */
  var onloadstart: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  /** Callback to be executed if the request made some progress */
  var onprogress: js.UndefOr[RequestEventListener[ProgressResponse[TContext]]] = js.undefined
  /** Callback to be executed if the request's ready state changed */
  var onreadystatechange: js.UndefOr[RequestEventListener[Response[TContext]]] = js.undefined
  /** Callback to be executed if the request failed due to a timeout */
  var ontimeout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** MIME type for the request */
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[
    tampermonkeyLib.tampermonkeyLibStrings.arraybuffer | tampermonkeyLib.tampermonkeyLibStrings.blob | tampermonkeyLib.tampermonkeyLibStrings.json
  ] = js.undefined
  /** Timeout in ms */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** Destination URL */
  var url: java.lang.String
  /** Username for authentication */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply[TContext](
    url: java.lang.String,
    anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    context: TContext = null,
    data: java.lang.String = null,
    fetch: js.UndefOr[scala.Boolean] = js.undefined,
    headers: RequestHeaders = null,
    method: tampermonkeyLib.tampermonkeyLibStrings.GET | tampermonkeyLib.tampermonkeyLibStrings.HEAD | tampermonkeyLib.tampermonkeyLibStrings.POST = null,
    onabort: () => scala.Unit = null,
    onerror: RequestEventListener[ErrorResponse] = null,
    onload: RequestEventListener[Response[TContext]] = null,
    onloadstart: RequestEventListener[Response[TContext]] = null,
    onprogress: RequestEventListener[ProgressResponse[TContext]] = null,
    onreadystatechange: RequestEventListener[Response[TContext]] = null,
    ontimeout: () => scala.Unit = null,
    overrideMimeType: java.lang.String = null,
    password: java.lang.String = null,
    responseType: tampermonkeyLib.tampermonkeyLibStrings.arraybuffer | tampermonkeyLib.tampermonkeyLibStrings.blob | tampermonkeyLib.tampermonkeyLibStrings.json = null,
    timeout: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): Request[TContext] = {
    val __obj = js.Dynamic.literal(url = url)
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(fetch)) __obj.updateDynamic("fetch")(fetch)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction0(onabort))
    if (onerror != null) __obj.updateDynamic("onerror")(onerror)
    if (onload != null) __obj.updateDynamic("onload")(onload)
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart)
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress)
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange)
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(js.Any.fromFunction0(ontimeout))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Request[TContext]]
  }
}


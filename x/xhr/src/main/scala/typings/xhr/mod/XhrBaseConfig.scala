package typings.xhr.mod

import typings.std.XMLHttpRequest
import typings.xhr.xhrStrings.DELETE
import typings.xhr.xhrStrings.GET
import typings.xhr.xhrStrings.HEAD
import typings.xhr.xhrStrings.OPTIONS
import typings.xhr.xhrStrings.POST
import typings.xhr.xhrStrings.PUT
import typings.xhr.xhrStrings._empty
import typings.xhr.xhrStrings.arraybuffer
import typings.xhr.xhrStrings.blob
import typings.xhr.xhrStrings.document
import typings.xhr.xhrStrings.json
import typings.xhr.xhrStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrBaseConfig extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
  var body: js.UndefOr[String | js.Any] = js.undefined
  var headers: js.UndefOr[XhrHeaders] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useXDR: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}

object XhrBaseConfig {
  @scala.inline
  def apply(
    beforeSend: /* xhrObject */ XMLHttpRequest => Unit = null,
    body: String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: _empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrBaseConfig]
  }
}


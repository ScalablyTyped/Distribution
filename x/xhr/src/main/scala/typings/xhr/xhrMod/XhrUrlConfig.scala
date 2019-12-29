package typings.xhr.xhrMod

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

trait XhrUrlConfig extends XhrBaseConfig {
  var url: String
}

object XhrUrlConfig {
  @scala.inline
  def apply(
    url: String,
    beforeSend: /* xhrObject */ XMLHttpRequest => Unit = null,
    body: String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: _empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrUrlConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrUrlConfig]
  }
}


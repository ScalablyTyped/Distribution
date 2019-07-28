package typings.xhr.xhrMod

import typings.std.XMLHttpRequest
import typings.xhr.xhrStrings.DELETE
import typings.xhr.xhrStrings.Empty
import typings.xhr.xhrStrings.GET
import typings.xhr.xhrStrings.HEAD
import typings.xhr.xhrStrings.OPTIONS
import typings.xhr.xhrStrings.POST
import typings.xhr.xhrStrings.PUT
import typings.xhr.xhrStrings.arraybuffer
import typings.xhr.xhrStrings.blob
import typings.xhr.xhrStrings.document
import typings.xhr.xhrStrings.json
import typings.xhr.xhrStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrUriConfig extends XhrBaseConfig {
  var uri: String
}

object XhrUriConfig {
  @scala.inline
  def apply(
    uri: String,
    beforeSend: /* xhrObject */ XMLHttpRequest => Unit = null,
    body: String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: Empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrUriConfig = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR)
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[XhrUriConfig]
  }
}


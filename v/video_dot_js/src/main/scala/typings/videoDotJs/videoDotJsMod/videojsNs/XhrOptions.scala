package typings.videoDotJs.videoDotJsMod.videojsNs

import typings.std.XMLHttpRequest
import typings.videoDotJs.videoDotJsStrings.DELETE
import typings.videoDotJs.videoDotJsStrings.Empty
import typings.videoDotJs.videoDotJsStrings.GET
import typings.videoDotJs.videoDotJsStrings.HEAD
import typings.videoDotJs.videoDotJsStrings.OPTIONS
import typings.videoDotJs.videoDotJsStrings.POST
import typings.videoDotJs.videoDotJsStrings.PUT
import typings.videoDotJs.videoDotJsStrings.arraybuffer
import typings.videoDotJs.videoDotJsStrings.blob
import typings.videoDotJs.videoDotJsStrings.document
import typings.videoDotJs.videoDotJsStrings.json
import typings.videoDotJs.videoDotJsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrOptions extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[Empty | arraybuffer | blob | document | json | text] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useXDR: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}

object XhrOptions {
  @scala.inline
  def apply(
    beforeSend: /* xhrObject */ XMLHttpRequest => Unit = null,
    body: js.Any = null,
    headers: js.Any = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: Empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    uri: String = null,
    url: String = null,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR)
    if (username != null) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[XhrOptions]
  }
}


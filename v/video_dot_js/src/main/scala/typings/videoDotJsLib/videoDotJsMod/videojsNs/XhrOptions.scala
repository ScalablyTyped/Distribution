package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrOptions extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[
    videoDotJsLib.videoDotJsLibStrings.DELETE | videoDotJsLib.videoDotJsLibStrings.GET | videoDotJsLib.videoDotJsLibStrings.HEAD | videoDotJsLib.videoDotJsLibStrings.OPTIONS | videoDotJsLib.videoDotJsLibStrings.POST | videoDotJsLib.videoDotJsLibStrings.PUT
  ] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[
    videoDotJsLib.videoDotJsLibStrings.Empty | videoDotJsLib.videoDotJsLibStrings.arraybuffer | videoDotJsLib.videoDotJsLibStrings.blob | videoDotJsLib.videoDotJsLibStrings.document | videoDotJsLib.videoDotJsLibStrings.json | videoDotJsLib.videoDotJsLibStrings.text
  ] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var useXDR: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  var xhr: js.UndefOr[stdLib.XMLHttpRequest] = js.undefined
}

object XhrOptions {
  @scala.inline
  def apply(
    beforeSend: /* xhrObject */ stdLib.XMLHttpRequest => scala.Unit = null,
    body: js.Any = null,
    headers: js.Any = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    method: videoDotJsLib.videoDotJsLibStrings.DELETE | videoDotJsLib.videoDotJsLibStrings.GET | videoDotJsLib.videoDotJsLibStrings.HEAD | videoDotJsLib.videoDotJsLibStrings.OPTIONS | videoDotJsLib.videoDotJsLibStrings.POST | videoDotJsLib.videoDotJsLibStrings.PUT = null,
    password: java.lang.String = null,
    responseType: videoDotJsLib.videoDotJsLibStrings.Empty | videoDotJsLib.videoDotJsLibStrings.arraybuffer | videoDotJsLib.videoDotJsLibStrings.blob | videoDotJsLib.videoDotJsLibStrings.document | videoDotJsLib.videoDotJsLibStrings.json | videoDotJsLib.videoDotJsLibStrings.text = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    uri: java.lang.String = null,
    url: java.lang.String = null,
    useXDR: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xhr: stdLib.XMLHttpRequest = null
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


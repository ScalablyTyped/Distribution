package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrUriConfig extends XhrBaseConfig {
  var uri: java.lang.String
}

object XhrUriConfig {
  @scala.inline
  def apply(
    uri: java.lang.String,
    beforeSend: js.Function1[/* xhrObject */ stdLib.XMLHttpRequest, scala.Unit] = null,
    body: java.lang.String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    method: xhrLib.xhrLibStrings.DELETE | xhrLib.xhrLibStrings.GET | xhrLib.xhrLibStrings.HEAD | xhrLib.xhrLibStrings.OPTIONS | xhrLib.xhrLibStrings.POST | xhrLib.xhrLibStrings.PUT = null,
    password: java.lang.String = null,
    responseType: xhrLib.xhrLibStrings.Empty | xhrLib.xhrLibStrings.arraybuffer | xhrLib.xhrLibStrings.blob | xhrLib.xhrLibStrings.document | xhrLib.xhrLibStrings.json | xhrLib.xhrLibStrings.text = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    useXDR: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    xhr: stdLib.XMLHttpRequest = null
  ): XhrUriConfig = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
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


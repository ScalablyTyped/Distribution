package typings.teenyDashRequest.teenyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithUri
  extends CoreOptions
     with Options {
  var uri: String
}

object OptionsWithUri {
  @scala.inline
  def apply(
    uri: String,
    body: String | js.Object = null,
    forever: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    json: js.Any = null,
    method: String = null,
    multipart: js.Array[RequestPart] = null,
    proxy: String = null,
    qs: js.Any = null,
    timeout: Int | Double = null,
    useQuerystring: js.UndefOr[Boolean] = js.undefined
  ): OptionsWithUri = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (json != null) __obj.updateDynamic("json")(json)
    if (method != null) __obj.updateDynamic("method")(method)
    if (multipart != null) __obj.updateDynamic("multipart")(multipart)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    __obj.asInstanceOf[OptionsWithUri]
  }
}


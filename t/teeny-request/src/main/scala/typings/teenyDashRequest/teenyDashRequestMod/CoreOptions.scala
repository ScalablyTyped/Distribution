package typings.teenyDashRequest.teenyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreOptions extends js.Object {
  var body: js.UndefOr[String | js.Object] = js.undefined
  var forever: js.UndefOr[Boolean] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var multipart: js.UndefOr[js.Array[RequestPart]] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var qs: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useQuerystring: js.UndefOr[Boolean] = js.undefined
}

object CoreOptions {
  @scala.inline
  def apply(
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
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}


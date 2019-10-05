package typings.vueDashResource.vuejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var before: js.UndefOr[js.Function1[/* request */ js.Any, _]] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var credentials: js.UndefOr[Boolean] = js.undefined
  var emulateHTTP: js.UndefOr[Boolean] = js.undefined
  var emulateJSON: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var progress: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    before: /* request */ js.Any => _ = null,
    body: js.Any = null,
    credentials: js.UndefOr[Boolean] = js.undefined,
    emulateHTTP: js.UndefOr[Boolean] = js.undefined,
    emulateJSON: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    method: String = null,
    params: js.Any = null,
    progress: /* event */ js.Any => _ = null,
    url: String = null
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials)
    if (!js.isUndefined(emulateHTTP)) __obj.updateDynamic("emulateHTTP")(emulateHTTP)
    if (!js.isUndefined(emulateJSON)) __obj.updateDynamic("emulateJSON")(emulateJSON)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HttpOptions]
  }
}


package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIFetchOptions
  extends stdLib.RequestInit {
  /**
    * Shorthand to be used in place of body, accepts an object value to be
    * stringified to JSON.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * Unlike `fetch`, the `Promise` return value of `apiFetch` will resolve to the
    * parsed JSON result. Disable this behavior by passing `parse` as `false`.
    *
    * @defaultValue true
    */
  var parse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Shorthand to be used in place of url, appended to the REST API root URL
    * for the current site.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Absolute URL to the endpoint from which to fetch.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object APIFetchOptions {
  @scala.inline
  def apply(
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    data: js.Object = null,
    headers: stdLib.HeadersInit = null,
    integrity: java.lang.String = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    mode: stdLib.RequestMode = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null,
    signal: stdLib.AbortSignal = null,
    url: java.lang.String = null,
    window: js.Any = null
  ): APIFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    if (path != null) __obj.updateDynamic("path")(path)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (url != null) __obj.updateDynamic("url")(url)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[APIFetchOptions]
  }
}


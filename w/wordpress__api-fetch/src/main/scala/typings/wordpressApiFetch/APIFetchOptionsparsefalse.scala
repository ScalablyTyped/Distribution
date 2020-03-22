package typings.wordpressApiFetch

import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.wordpressApiFetch.wordpressApiFetchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @wordpress/api-fetch.@wordpress/api-fetch.APIFetchOptions & {  parse  :false} */
trait APIFetchOptionsparsefalse extends js.Object {
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[BodyInit | Null] = js.undefined
  /**
    * A string indicating how the request will interact with the browser's cache to set request's cache.
    */
  var cache: js.UndefOr[RequestCache] = js.undefined
  /**
    * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
    */
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  /**
    * Shorthand to be used in place of body, accepts an object value to be
    * stringified to JSON.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[HeadersInit] = js.undefined
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[String] = js.undefined
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[Boolean] = js.undefined
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
    */
  var mode: js.UndefOr[RequestMode] = js.undefined
  /**
    * Unlike `fetch`, the `Promise` return value of `apiFetch` will resolve to the
    * parsed JSON result. Disable this behavior by passing `parse` as `false`.
    *
    * @defaultValue true
    */
  var parse: js.UndefOr[Boolean with `false`] = js.undefined
  /**
    * Shorthand to be used in place of url, appended to the REST API root URL
    * for the current site.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    */
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  /**
    * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
    */
  var referrer: js.UndefOr[String] = js.undefined
  /**
    * A referrer policy to set request's referrerPolicy.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[AbortSignal | Null] = js.undefined
  /**
    * Absolute URL to the endpoint from which to fetch.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Can only be null. Used to disassociate request from any Window.
    */
  var window: js.UndefOr[js.Any] = js.undefined
}

object APIFetchOptionsparsefalse {
  @scala.inline
  def apply(
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    data: js.Object = null,
    headers: HeadersInit = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    mode: RequestMode = null,
    parse: js.UndefOr[Boolean with `false`] = js.undefined,
    path: String = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    signal: AbortSignal = null,
    url: String = null,
    window: js.Any = null
  ): APIFetchOptionsparsefalse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIFetchOptionsparsefalse]
  }
}


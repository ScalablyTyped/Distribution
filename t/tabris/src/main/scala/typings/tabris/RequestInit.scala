package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.`force-cache`
import typings.tabris.tabrisStrings.`no-cache`
import typings.tabris.tabrisStrings.`no-cors`
import typings.tabris.tabrisStrings.`no-store`
import typings.tabris.tabrisStrings.`only-if-cached`
import typings.tabris.tabrisStrings.`same-origin`
import typings.tabris.tabrisStrings.cors
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.include
import typings.tabris.tabrisStrings.omit
import typings.tabris.tabrisStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RequestInit
trait RequestInit extends js.Object {
  /**
    * The body of the request. GET or HEAD requests can not have a body.
    */
  var body: js.UndefOr[Blob | FormData | String] = js.undefined
  var cache: js.UndefOr[default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload] = js.undefined
  var credentials: js.UndefOr[include | omit | `same-origin`] = js.undefined
  /**
    * The headers to add to the request.
    */
  var headers: js.UndefOr[Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]] = js.undefined
  /**
    * The request method, e.g., `'GET'`, `'POST'`.
    */
  var method: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[cors | `no-cors` | `same-origin`] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: Blob | FormData | String = null,
    cache: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload = null,
    credentials: include | omit | `same-origin` = null,
    headers: Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String] = null,
    method: String = null,
    mode: cors | `no-cors` | `same-origin` = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}


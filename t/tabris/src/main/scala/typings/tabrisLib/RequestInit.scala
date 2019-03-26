package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  var body: js.UndefOr[BodyInit] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  var credentials: js.UndefOr[RequestCredentials] = js.undefined
  var headers: js.UndefOr[HeaderInit | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeaderInit | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    mode: RequestMode = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[RequestInit]
  }
}


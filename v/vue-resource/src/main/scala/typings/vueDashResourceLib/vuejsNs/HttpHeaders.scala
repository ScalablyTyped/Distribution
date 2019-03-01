package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeaders
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var common: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var custom: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var delete: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var patch: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var post: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var put: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object HttpHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    common: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    custom: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    delete: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    patch: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    post: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    put: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): HttpHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (common != null) __obj.updateDynamic("common")(common)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (patch != null) __obj.updateDynamic("patch")(patch)
    if (post != null) __obj.updateDynamic("post")(post)
    if (put != null) __obj.updateDynamic("put")(put)
    __obj.asInstanceOf[HttpHeaders]
  }
}


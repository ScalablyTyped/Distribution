package typings.vueDashResource.vuejsNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeaders
  extends /* key */ StringDictionary[js.Any] {
  var common: js.UndefOr[StringDictionary[String]] = js.undefined
  var custom: js.UndefOr[StringDictionary[String]] = js.undefined
  var delete: js.UndefOr[StringDictionary[String]] = js.undefined
  var patch: js.UndefOr[StringDictionary[String]] = js.undefined
  var post: js.UndefOr[StringDictionary[String]] = js.undefined
  var put: js.UndefOr[StringDictionary[String]] = js.undefined
}

object HttpHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    common: StringDictionary[String] = null,
    custom: StringDictionary[String] = null,
    delete: StringDictionary[String] = null,
    patch: StringDictionary[String] = null,
    post: StringDictionary[String] = null,
    put: StringDictionary[String] = null
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


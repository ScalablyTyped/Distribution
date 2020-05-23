package typings.tldjs.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractHostname extends js.Object {
  var extractHostname: js.UndefOr[ReturnType[js.Function1[/* host */ String, String | Null]]] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validHosts: js.UndefOr[js.Array[String]] = js.undefined
}

object ExtractHostname {
  @scala.inline
  def apply(
    extractHostname: ReturnType[js.Function1[/* host */ String, String | Null]] = null,
    rules: js.Any = null,
    validHosts: js.Array[String] = null
  ): ExtractHostname = {
    val __obj = js.Dynamic.literal()
    if (extractHostname != null) __obj.updateDynamic("extractHostname")(extractHostname.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (validHosts != null) __obj.updateDynamic("validHosts")(validHosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractHostname]
  }
}


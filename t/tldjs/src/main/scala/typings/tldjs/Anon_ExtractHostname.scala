package typings.tldjs

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtractHostname extends js.Object {
  var extractHostname: js.UndefOr[ReturnType[js.Function1[/* host */ String, String | Null]]] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validHosts: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ExtractHostname {
  @scala.inline
  def apply(
    extractHostname: ReturnType[js.Function1[/* host */ String, String | Null]] = null,
    rules: js.Any = null,
    validHosts: js.Array[String] = null
  ): Anon_ExtractHostname = {
    val __obj = js.Dynamic.literal()
    if (extractHostname != null) __obj.updateDynamic("extractHostname")(extractHostname)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (validHosts != null) __obj.updateDynamic("validHosts")(validHosts)
    __obj.asInstanceOf[Anon_ExtractHostname]
  }
}


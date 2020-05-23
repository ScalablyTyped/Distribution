package typings.tldjs.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends js.Object {
  var extractHostname: js.UndefOr[
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
    ]
  ] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validHosts: js.UndefOr[js.Array[String]] = js.undefined
}

object Rules {
  @scala.inline
  def apply(
    extractHostname: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
    ] = null,
    rules: js.Any = null,
    validHosts: js.Array[String] = null
  ): Rules = {
    val __obj = js.Dynamic.literal()
    if (extractHostname != null) __obj.updateDynamic("extractHostname")(extractHostname.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (validHosts != null) __obj.updateDynamic("validHosts")(validHosts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
}


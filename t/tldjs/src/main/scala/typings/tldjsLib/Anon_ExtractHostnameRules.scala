package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtractHostnameRules extends js.Object {
  var extractHostname: js.UndefOr[
    stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
    ]
  ] = js.undefined
  var rules: js.UndefOr[js.Any] = js.undefined
  var validHosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ExtractHostnameRules {
  @scala.inline
  def apply(
    extractHostname: stdLib.ReturnType[
      /* import warning: ImportType.apply Failed type conversion: typeof extractHostname */ js.Any
    ] = null,
    rules: js.Any = null,
    validHosts: js.Array[java.lang.String] = null
  ): Anon_ExtractHostnameRules = {
    val __obj = js.Dynamic.literal()
    if (extractHostname != null) __obj.updateDynamic("extractHostname")(extractHostname)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (validHosts != null) __obj.updateDynamic("validHosts")(validHosts)
    __obj.asInstanceOf[Anon_ExtractHostnameRules]
  }
}


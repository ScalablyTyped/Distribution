package typings
package wikidataDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat] = js.undefined
  var language: js.UndefOr[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage] = js.undefined
  var limit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var search: java.lang.String
  var uselang: js.UndefOr[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    search: java.lang.String,
    format: wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat = null,
    language: wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage = null,
    limit: java.lang.String | scala.Double = null,
    uselang: wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(search = search)
    if (format != null) __obj.updateDynamic("format")(format)
    if (language != null) __obj.updateDynamic("language")(language)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (uselang != null) __obj.updateDynamic("uselang")(uselang)
    __obj.asInstanceOf[Anon_Format]
  }
}


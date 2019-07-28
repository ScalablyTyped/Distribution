package typings.wikidataDashSdk

import typings.wikidataDashSdk.defTypeFormatMod.UrlResultFormat
import typings.wikidataDashSdk.defTypeLanguageMod.WikidataLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: js.UndefOr[UrlResultFormat] = js.undefined
  var language: js.UndefOr[WikidataLanguage] = js.undefined
  var limit: js.UndefOr[String | Double] = js.undefined
  var search: String
  var uselang: js.UndefOr[WikidataLanguage] = js.undefined
}

object Anon_Format {
  @scala.inline
  def apply(
    search: String,
    format: UrlResultFormat = null,
    language: WikidataLanguage = null,
    limit: String | Double = null,
    uselang: WikidataLanguage = null
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(search = search)
    if (format != null) __obj.updateDynamic("format")(format)
    if (language != null) __obj.updateDynamic("language")(language)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (uselang != null) __obj.updateDynamic("uselang")(uselang)
    __obj.asInstanceOf[Anon_Format]
  }
}


package typings.wikidataDashSdk

import typings.wikidataDashSdk.defTypeFormatMod.UrlResultFormat
import typings.wikidataDashSdk.defTypeLanguageMod.WikidataLanguage
import typings.wikidataDashSdk.defTypePropertyMod.WikidataProperty
import typings.wikidataDashSdk.defTypeSiteMod.WikidataSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatLanguages extends js.Object {
  var format: js.UndefOr[UrlResultFormat] = js.undefined
  var languages: js.UndefOr[WikidataLanguage | js.Array[WikidataLanguage]] = js.undefined
  var props: js.UndefOr[WikidataProperty | js.Array[WikidataProperty]] = js.undefined
  var sites: js.UndefOr[WikidataSite] = js.undefined
  var titles: String | js.Array[String]
}

object Anon_FormatLanguages {
  @scala.inline
  def apply(
    titles: String | js.Array[String],
    format: UrlResultFormat = null,
    languages: WikidataLanguage | js.Array[WikidataLanguage] = null,
    props: WikidataProperty | js.Array[WikidataProperty] = null,
    sites: WikidataSite = null
  ): Anon_FormatLanguages = {
    val __obj = js.Dynamic.literal(titles = titles.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites)
    __obj.asInstanceOf[Anon_FormatLanguages]
  }
}


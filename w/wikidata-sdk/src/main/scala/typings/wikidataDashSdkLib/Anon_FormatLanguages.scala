package typings
package wikidataDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatLanguages extends js.Object {
  var format: js.UndefOr[wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat] = js.undefined
  var languages: js.UndefOr[
    wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage | js.Array[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage]
  ] = js.undefined
  var props: js.UndefOr[
    wikidataDashSdkLib.defTypePropertyMod.WikidataProperty | js.Array[wikidataDashSdkLib.defTypePropertyMod.WikidataProperty]
  ] = js.undefined
  var sites: js.UndefOr[wikidataDashSdkLib.defTypeSiteMod.WikidataSite] = js.undefined
  var titles: java.lang.String | js.Array[java.lang.String]
}

object Anon_FormatLanguages {
  @scala.inline
  def apply(
    titles: java.lang.String | js.Array[java.lang.String],
    format: wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat = null,
    languages: wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage | js.Array[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage] = null,
    props: wikidataDashSdkLib.defTypePropertyMod.WikidataProperty | js.Array[wikidataDashSdkLib.defTypePropertyMod.WikidataProperty] = null,
    sites: wikidataDashSdkLib.defTypeSiteMod.WikidataSite = null
  ): Anon_FormatLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (sites != null) __obj.updateDynamic("sites")(sites)
    __obj.asInstanceOf[Anon_FormatLanguages]
  }
}


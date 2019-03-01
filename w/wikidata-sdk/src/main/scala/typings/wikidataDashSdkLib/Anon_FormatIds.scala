package typings
package wikidataDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatIds extends js.Object {
  var format: js.UndefOr[wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat] = js.undefined
  var ids: java.lang.String | js.Array[java.lang.String]
  var languages: js.UndefOr[
    wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage | js.Array[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage]
  ] = js.undefined
  var props: js.UndefOr[
    wikidataDashSdkLib.defTypePropertyMod.WikidataProperty | js.Array[wikidataDashSdkLib.defTypePropertyMod.WikidataProperty]
  ] = js.undefined
}

object Anon_FormatIds {
  @scala.inline
  def apply(
    ids: java.lang.String | js.Array[java.lang.String],
    format: wikidataDashSdkLib.defTypeFormatMod.UrlResultFormat = null,
    languages: wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage | js.Array[wikidataDashSdkLib.defTypeLanguageMod.WikidataLanguage] = null,
    props: wikidataDashSdkLib.defTypePropertyMod.WikidataProperty | js.Array[wikidataDashSdkLib.defTypePropertyMod.WikidataProperty] = null
  ): Anon_FormatIds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FormatIds]
  }
}


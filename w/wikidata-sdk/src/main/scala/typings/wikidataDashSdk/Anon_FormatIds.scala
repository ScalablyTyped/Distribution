package typings.wikidataDashSdk

import typings.wikidataDashSdk.defTypeFormatMod.UrlResultFormat
import typings.wikidataDashSdk.defTypeLanguageMod.WikidataLanguage
import typings.wikidataDashSdk.defTypePropertyMod.WikidataProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FormatIds extends js.Object {
  var format: js.UndefOr[UrlResultFormat] = js.undefined
  var ids: String | js.Array[String]
  var languages: js.UndefOr[WikidataLanguage | js.Array[WikidataLanguage]] = js.undefined
  var props: js.UndefOr[WikidataProperty | js.Array[WikidataProperty]] = js.undefined
}

object Anon_FormatIds {
  @scala.inline
  def apply(
    ids: String | js.Array[String],
    format: UrlResultFormat = null,
    languages: WikidataLanguage | js.Array[WikidataLanguage] = null,
    props: WikidataProperty | js.Array[WikidataProperty] = null
  ): Anon_FormatIds = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FormatIds]
  }
}


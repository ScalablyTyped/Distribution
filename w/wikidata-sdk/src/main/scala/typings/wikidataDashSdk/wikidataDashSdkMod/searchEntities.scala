package typings.wikidataDashSdk.wikidataDashSdkMod

import typings.wikidataDashSdk.Anon_Format
import typings.wikidataDashSdk.defTypeFormatMod.UrlResultFormat
import typings.wikidataDashSdk.defTypeLanguageMod.WikidataLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wikidata-sdk", "searchEntities")
@js.native
object searchEntities extends js.Object {
  def apply(opt: Anon_Format): String = js.native
  def apply(search: String): String = js.native
  def apply(search: String, language: WikidataLanguage): String = js.native
  def apply(search: String, language: WikidataLanguage, limit: String): String = js.native
  def apply(search: String, language: WikidataLanguage, limit: String, format: UrlResultFormat): String = js.native
  def apply(
    search: String,
    language: WikidataLanguage,
    limit: String,
    format: UrlResultFormat,
    uselang: WikidataLanguage
  ): String = js.native
  def apply(search: String, language: WikidataLanguage, limit: Double): String = js.native
  def apply(search: String, language: WikidataLanguage, limit: Double, format: UrlResultFormat): String = js.native
  def apply(
    search: String,
    language: WikidataLanguage,
    limit: Double,
    format: UrlResultFormat,
    uselang: WikidataLanguage
  ): String = js.native
}


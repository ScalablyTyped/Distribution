package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiableLanguages. */
trait IdentifiableLanguages extends js.Object {
  /** A list of all languages that the service can identify. */
  var languages: js.Array[IdentifiableLanguage]
}

object IdentifiableLanguages {
  @scala.inline
  def apply(languages: js.Array[IdentifiableLanguage]): IdentifiableLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentifiableLanguages]
  }
}


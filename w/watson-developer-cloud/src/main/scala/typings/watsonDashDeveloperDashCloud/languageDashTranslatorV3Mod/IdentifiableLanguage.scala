package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiableLanguage. */
trait IdentifiableLanguage extends js.Object {
  /** The language code for an identifiable language. */
  var language: String
  /** The name of the identifiable language. */
  var name: String
}

object IdentifiableLanguage {
  @scala.inline
  def apply(language: String, name: String): IdentifiableLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentifiableLanguage]
  }
}


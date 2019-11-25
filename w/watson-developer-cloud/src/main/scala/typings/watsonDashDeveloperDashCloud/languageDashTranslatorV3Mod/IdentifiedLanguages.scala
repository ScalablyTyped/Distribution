package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiedLanguages. */
trait IdentifiedLanguages extends js.Object {
  /** A ranking of identified languages with confidence scores. */
  var languages: js.Array[IdentifiedLanguage]
}

object IdentifiedLanguages {
  @scala.inline
  def apply(languages: js.Array[IdentifiedLanguage]): IdentifiedLanguages = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IdentifiedLanguages]
  }
}


package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiedLanguage. */
trait IdentifiedLanguage extends js.Object {
  /** The confidence score for the identified language. */
  var confidence: Double
  /** The language code for an identified language. */
  var language: String
}

object IdentifiedLanguage {
  @scala.inline
  def apply(confidence: Double, language: String): IdentifiedLanguage = {
    val __obj = js.Dynamic.literal(confidence = confidence, language = language)
  
    __obj.asInstanceOf[IdentifiedLanguage]
  }
}


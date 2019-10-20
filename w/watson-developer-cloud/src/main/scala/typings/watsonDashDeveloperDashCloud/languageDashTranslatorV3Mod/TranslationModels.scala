package typings.watsonDashDeveloperDashCloud.languageDashTranslatorV3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response type for listing existing translation models. */
trait TranslationModels extends js.Object {
  /** An array of available models. */
  var models: js.Array[TranslationModel]
}

object TranslationModels {
  @scala.inline
  def apply(models: js.Array[TranslationModel]): TranslationModels = {
    val __obj = js.Dynamic.literal(models = models)
  
    __obj.asInstanceOf[TranslationModels]
  }
}


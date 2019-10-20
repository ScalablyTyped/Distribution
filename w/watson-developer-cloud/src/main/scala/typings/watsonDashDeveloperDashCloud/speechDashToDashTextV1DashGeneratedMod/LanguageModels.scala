package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** LanguageModels. */
trait LanguageModels extends js.Object {
  /** An array of `LanguageModel` objects that provides information about each available custom language model. The array is empty if the requesting credentials own no custom language models (if no language is specified) or own no custom language models for the specified language. */
  var customizations: js.Array[LanguageModel]
}

object LanguageModels {
  @scala.inline
  def apply(customizations: js.Array[LanguageModel]): LanguageModels = {
    val __obj = js.Dynamic.literal(customizations = customizations)
  
    __obj.asInstanceOf[LanguageModels]
  }
}


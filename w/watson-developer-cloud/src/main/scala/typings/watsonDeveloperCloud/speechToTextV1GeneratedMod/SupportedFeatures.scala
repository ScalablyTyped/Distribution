package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the additional service features that are supported with the model. */
trait SupportedFeatures extends js.Object {
  /** Indicates whether the customization interface can be used to create a custom language model based on the language model. */
  var custom_language_model: Boolean
  /** Indicates whether the `speaker_labels` parameter can be used with the language model. */
  var speaker_labels: Boolean
}

object SupportedFeatures {
  @scala.inline
  def apply(custom_language_model: Boolean, speaker_labels: Boolean): SupportedFeatures = {
    val __obj = js.Dynamic.literal(custom_language_model = custom_language_model.asInstanceOf[js.Any], speaker_labels = speaker_labels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SupportedFeatures]
  }
}


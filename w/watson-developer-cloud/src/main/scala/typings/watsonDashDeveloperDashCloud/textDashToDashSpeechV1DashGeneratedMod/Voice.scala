package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Voice. */
trait Voice extends js.Object {
  /** If `true`, the voice can be customized; if `false`, the voice cannot be customized. (Same as `custom_pronunciation`; maintained for backward compatibility.). */
  var customizable: Boolean
  /** Returns information about a specified custom voice model. This field is returned only by the **Get a voice** method and only when you specify the customization ID of a custom voice model. */
  var customization: js.UndefOr[VoiceModel] = js.undefined
  /** A textual description of the voice. */
  var description: String
  /** The gender of the voice: `male` or `female`. */
  var gender: String
  /** The language and region of the voice (for example, `en-US`). */
  var language: String
  /** The name of the voice. Use this as the voice identifier in all requests. */
  var name: String
  /** Describes the additional service features that are supported with the voice. */
  var supported_features: SupportedFeatures
  /** The URI of the voice. */
  var url: String
}

object Voice {
  @scala.inline
  def apply(
    customizable: Boolean,
    description: String,
    gender: String,
    language: String,
    name: String,
    supported_features: SupportedFeatures,
    url: String,
    customization: VoiceModel = null
  ): Voice = {
    val __obj = js.Dynamic.literal(customizable = customizable, description = description, gender = gender, language = language, name = name, supported_features = supported_features, url = url)
    if (customization != null) __obj.updateDynamic("customization")(customization)
    __obj.asInstanceOf[Voice]
  }
}


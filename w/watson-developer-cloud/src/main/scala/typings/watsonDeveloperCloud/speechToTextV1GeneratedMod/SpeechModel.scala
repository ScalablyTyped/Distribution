package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SpeechModel. */
trait SpeechModel extends js.Object {
  /** A brief description of the model. */
  var description: String
  /** The language identifier of the model (for example, `en-US`). */
  var language: String
  /** The name of the model for use as an identifier in calls to the service (for example, `en-US_BroadbandModel`). */
  var name: String
  /** The sampling rate (minimum acceptable rate for audio) used by the model in Hertz. */
  var rate: Double
  /** Describes the additional service features that are supported with the model. */
  var supported_features: SupportedFeatures
  /** The URI for the model. */
  var url: String
}

object SpeechModel {
  @scala.inline
  def apply(
    description: String,
    language: String,
    name: String,
    rate: Double,
    supported_features: SupportedFeatures,
    url: String
  ): SpeechModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], supported_features = supported_features.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpeechModel]
  }
}


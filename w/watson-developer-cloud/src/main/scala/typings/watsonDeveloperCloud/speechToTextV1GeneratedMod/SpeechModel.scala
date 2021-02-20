package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechModel. */
@js.native
trait SpeechModel extends StObject {
  
  /** A brief description of the model. */
  var description: String = js.native
  
  /** The language identifier of the model (for example, `en-US`). */
  var language: String = js.native
  
  /** The name of the model for use as an identifier in calls to the service (for example, `en-US_BroadbandModel`). */
  var name: String = js.native
  
  /** The sampling rate (minimum acceptable rate for audio) used by the model in Hertz. */
  var rate: Double = js.native
  
  /** Describes the additional service features that are supported with the model. */
  var supported_features: SupportedFeatures = js.native
  
  /** The URI for the model. */
  var url: String = js.native
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
  
  @scala.inline
  implicit class SpeechModelMutableBuilder[Self <: SpeechModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported_features(value: SupportedFeatures): Self = StObject.set(x, "supported_features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `upgradeAcousticModel` operation. */
trait UpgradeAcousticModelParams extends StObject {
  
  /** If the custom acoustic model was trained with a custom language model, the customization ID (GUID) of that custom language model. The custom language model must be upgraded before the custom acoustic model can be upgraded. The credentials specified with the request must own both custom models. */
  var custom_language_model_id: js.UndefOr[String] = js.undefined
  
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String
  
  /** If `true`, forces the upgrade of a custom acoustic model for which no input data has been modified since it was last trained. Use this parameter only to force the upgrade of a custom acoustic model that is trained with a custom language model, and only if you receive a 400 response code and the message `No input data modified since last training`. See [Upgrading a custom acoustic model](https://cloud.ibm.com/docs/services/speech-to-text/custom-upgrade.html#upgradeAcoustic). */
  var force: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object UpgradeAcousticModelParams {
  
  @scala.inline
  def apply(customization_id: String): UpgradeAcousticModelParams = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAcousticModelParams]
  }
  
  @scala.inline
  implicit class UpgradeAcousticModelParamsMutableBuilder[Self <: UpgradeAcousticModelParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_language_model_id(value: String): Self = StObject.set(x, "custom_language_model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_language_model_idUndefined: Self = StObject.set(x, "custom_language_model_id", js.undefined)
    
    @scala.inline
    def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}

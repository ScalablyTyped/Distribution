package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** AcousticModel. */
@js.native
trait AcousticModel extends StObject {
  
  /** The name of the language model for which the custom acoustic model was created. */
  var base_model_name: js.UndefOr[String] = js.native
  
  /** The date and time in Coordinated Universal Time (UTC) at which the custom acoustic model was created. The value is provided in full ISO 8601 format (`YYYY-MM-DDThh:mm:ss.sTZD`). */
  var created: js.UndefOr[String] = js.native
  
  /** The customization ID (GUID) of the custom acoustic model. The **Create a custom acoustic model** method returns only this field of the object; it does not return the other fields. */
  var customization_id: String = js.native
  
  /** The description of the custom acoustic model. */
  var description: js.UndefOr[String] = js.native
  
  /** The language identifier of the custom acoustic model (for example, `en-US`). */
  var language: js.UndefOr[String] = js.native
  
  /** The name of the custom acoustic model. */
  var name: js.UndefOr[String] = js.native
  
  /** The GUID of the credentials for the instance of the service that owns the custom acoustic model. */
  var owner: js.UndefOr[String] = js.native
  
  /** A percentage that indicates the progress of the custom acoustic model's current training. A value of `100` means that the model is fully trained. **Note:** The `progress` field does not currently reflect the progress of the training. The field changes from `0` to `100` when training is complete. */
  var progress: js.UndefOr[Double] = js.native
  
  /** The current status of the custom acoustic model: * `pending`: The model was created but is waiting either for training data to be added or for the service to finish analyzing added data. * `ready`: The model contains data and is ready to be trained. * `training`: The model is currently being trained. * `available`: The model is trained and ready to use. * `upgrading`: The model is currently being upgraded. * `failed`: Training of the model failed. */
  var status: js.UndefOr[String] = js.native
  
  /** A list of the available versions of the custom acoustic model. Each element of the array indicates a version of the base model with which the custom model can be used. Multiple versions exist only if the custom model has been upgraded; otherwise, only a single version is shown. */
  var versions: js.UndefOr[js.Array[String]] = js.native
  
  /** If the request included unknown parameters, the following message: `Unexpected query parameter(s) ['parameters'] detected`, where `parameters` is a list that includes a quoted string for each unknown parameter. */
  var warnings: js.UndefOr[String] = js.native
}
object AcousticModel {
  
  @scala.inline
  def apply(customization_id: String): AcousticModel = {
    val __obj = js.Dynamic.literal(customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcousticModel]
  }
  
  @scala.inline
  implicit class AcousticModelMutableBuilder[Self <: AcousticModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase_model_name(value: String): Self = StObject.set(x, "base_model_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_model_nameUndefined: Self = StObject.set(x, "base_model_name", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setCustomization_id(value: String): Self = StObject.set(x, "customization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: String): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}

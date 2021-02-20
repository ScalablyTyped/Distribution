package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Model. */
@js.native
trait Model extends StObject {
  
  /** A dateTime indicating when the model was created. */
  var created: js.UndefOr[String] = js.native
  
  /** Model description. */
  var description: js.UndefOr[String] = js.native
  
  /** ISO 639-1 code indicating the language of the model. */
  var language: js.UndefOr[String] = js.native
  
  /** Unique model ID. */
  var model_id: js.UndefOr[String] = js.native
  
  /** When the status is `available`, the model is ready to use. */
  var status: js.UndefOr[String] = js.native
  
  /** The model version, if it was manually provided in Watson Knowledge Studio. */
  var version: js.UndefOr[String] = js.native
  
  /** The description of the version, if it was manually provided in Watson Knowledge Studio. */
  var version_description: js.UndefOr[String] = js.native
  
  /** ID of the Watson Knowledge Studio workspace that deployed this model to Natural Language Understanding. */
  var workspace_id: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setModel_id(value: String): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersion_description(value: String): Self = StObject.set(x, "version_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_descriptionUndefined: Self = StObject.set(x, "version_description", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_idUndefined: Self = StObject.set(x, "workspace_id", js.undefined)
  }
}
